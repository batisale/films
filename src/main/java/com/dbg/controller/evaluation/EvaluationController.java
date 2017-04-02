package com.dbg.controller.evaluation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbg.dto.EvaluationDTO;
import com.dbg.service.evaluation.EvaluationService;

@Controller
public class EvaluationController {

	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EvaluationDTO findById(@PathVariable("id") Integer id) {
		return evaluationService.findByID(id);
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public List<EvaluationDTO> findByName(@PathVariable("name") String name) {
		return evaluationService.recover(name);
	}
	
	@RequestMapping(value = "/{title}", method = RequestMethod.GET)
	public List<EvaluationDTO> findByTitle(@PathVariable("title") String title) {
		return evaluationService.recoverTitle(title);
	}

	@RequestMapping(value = "/evaluation", method = RequestMethod.GET)
	public List<EvaluationDTO> getEvaluation(@RequestParam Map<String, String> requestParams) throws Exception {
		String idCategory = requestParams.get("idCategory");
		String idUser = requestParams.get("idUser");
		String idFilm = requestParams.get("idFilm");

		return evaluationService.recoveryEvaluation(idCategory, idUser, idFilm);
	}

}
