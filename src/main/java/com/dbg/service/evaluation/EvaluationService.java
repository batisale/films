package com.dbg.service.evaluation;

import java.util.List;

import com.dbg.dto.EvaluationDTO;
import com.dbg.model.evaluation.Evaluation;

public interface EvaluationService {

	Evaluation findById(Integer idEvaluation);
	
	EvaluationDTO findByID(Integer idEvaluation);
	
	void delete(Integer idEvaluation);
	
	Evaluation save(Evaluation evaluation);

	EvaluationDTO transform(Evaluation e);

	Evaluation transform(EvaluationDTO e);
	
	EvaluationDTO save(EvaluationDTO evaluationDTO);
	
	List<EvaluationDTO> recoveryEvaluation(String idCategory, String idUser, String idFilm); 
	
	List <EvaluationDTO> recover(String name);
	
	List <EvaluationDTO> recoverTitle(String title);
	
}
