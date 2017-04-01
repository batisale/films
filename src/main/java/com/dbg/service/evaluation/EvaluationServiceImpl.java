package com.dbg.service.evaluation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.evaluation.EvaluationDao;
import com.dbg.model.evaluation.Evaluation;

@Service
public class EvaluationServiceImpl implements EvaluationService{

	@Autowired
	private EvaluationDao evaluationDao;
	
	@Override
	public Evaluation findById(Integer idEvaluation) {

		return evaluationDao.findOne(idEvaluation);
	}

	@Override
	public void delete(Integer idEvaluation) {
		
		evaluationDao.delete(idEvaluation);
		
	}

	@Override
	public Evaluation save(Evaluation evaluation) {
		
		return evaluationDao.save(evaluation);
		
	}
	
}
