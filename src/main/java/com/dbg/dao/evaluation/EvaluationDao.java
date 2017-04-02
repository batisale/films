package com.dbg.dao.evaluation;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dbg.model.evaluation.Evaluation;
import com.dbg.model.film.Film;
import com.dbg.model.user.User;

@Repository
public interface EvaluationDao extends PagingAndSortingRepository<Evaluation, Integer> {

	public List<Evaluation> findById(Integer id);

	List<Evaluation> findByCategoryAndUserAndFilm(@Param(value = "idCategory") String idCategory, @Param(value = "idUser") String idUser, @Param(value = "idFilm") String idFilm);
	
	List<Evaluation> findByUser(User user);
	
	List<Evaluation> findByTitle(Film film);
	
}