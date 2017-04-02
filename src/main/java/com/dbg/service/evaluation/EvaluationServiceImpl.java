package com.dbg.service.evaluation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.evaluation.EvaluationDao;
import com.dbg.dto.EvaluationDTO;
import com.dbg.model.evaluation.Evaluation;
import com.dbg.model.film.Film;
import com.dbg.model.user.User;
import com.dbg.service.film.FilmService;
import com.dbg.service.user.UserService;

@Service
public class EvaluationServiceImpl implements EvaluationService {

	@Autowired
	private EvaluationDao evaluationDao;

	@Autowired
	private UserService userService;

	@Autowired
	private FilmService filmService;

	@Override
	public Evaluation findById(Integer idEvaluation) {

		return evaluationDao.findOne(idEvaluation);
	}

	public EvaluationDTO findByID(Integer idEvaluation) {

		return transform(evaluationDao.findOne(idEvaluation));

	}

	@Override
	public void delete(Integer idEvaluation) {

		evaluationDao.delete(idEvaluation);

	}

	@Override
	public Evaluation save(Evaluation evaluation) {

		return evaluationDao.save(evaluation);

	}

	@Override
	public EvaluationDTO save(EvaluationDTO evaluationDTO) {

		Evaluation e = transform(evaluationDTO);

		return transform(save(e));

	}

	@Override
	public Evaluation transform(EvaluationDTO e) {
		User u = userService.findByName(e.getName());
		Film f = filmService.findByTitle(e.getTitle());
		Integer puntuacion = new Integer(e.getPoints());
		Evaluation evaluation = new Evaluation();
		evaluation.setId(e.getId());
		evaluation.setUser(u);
		evaluation.setFilm(f);
		evaluation.setPoints(puntuacion);
		return evaluation;
	}

	@Override
	public EvaluationDTO transform(Evaluation e) {

		EvaluationDTO evaluationDTO = new EvaluationDTO();
		evaluationDTO.setId(e.getId());
		evaluationDTO.setPoints(e.getPoints().intValue());
		evaluationDTO.setName(e.getUser().getName());
		evaluationDTO.setTitle(e.getFilm().getTitle());
		return evaluationDTO;

	}

	@Override
	public List<EvaluationDTO> recoveryEvaluation(String idCategory, String idUser, String idFilm) {

		List<EvaluationDTO> lista = new ArrayList<EvaluationDTO>();

		List<Evaluation> list = evaluationDao.findByCategoryAndUserAndFilm(idCategory, idUser, idFilm);

		for (Evaluation evaluation : list) {
			lista.add(transform(evaluation));
		}

		return lista;

	}

	@Override
	public List<EvaluationDTO> recover(String name) {
		
		User u = userService.findByName(name);

		List<EvaluationDTO> lista = new ArrayList<EvaluationDTO>();

		List<Evaluation> list = evaluationDao.findByUser(u);
		
		for (Evaluation evaluation : list) {
			lista.add(transform(evaluation));
		}

		return lista;

	}
	
	public List<EvaluationDTO> recoverTitle(String title)
	{
		
		Film f = filmService.findByTitle(title);

		List<EvaluationDTO> lista = new ArrayList<EvaluationDTO>();

		List<Evaluation> list = evaluationDao.findByTitle(f);
		
		for (Evaluation evaluation : list) {
			lista.add(transform(evaluation));
		}

		return lista;

		
	}

}
