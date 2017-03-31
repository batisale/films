package com.dbg.dao.evaluation;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dbg.model.evaluation.Evaluation;
@Repository
public interface EvaluationDao extends PagingAndSortingRepository<Evaluation, Integer> {

	public List<Evaluation> findById(Integer id);

}