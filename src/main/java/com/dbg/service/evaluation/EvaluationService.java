package com.dbg.service.evaluation;

import com.dbg.model.evaluation.Evaluation;

public interface EvaluationService {

	Evaluation findById(Integer idEvaluation);
	
	void delete(Integer idEvaluation);
	
	Evaluation save(Evaluation evaluation);
	
}
