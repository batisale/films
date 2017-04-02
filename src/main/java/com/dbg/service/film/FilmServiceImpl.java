package com.dbg.service.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.film.FilmDao;
import com.dbg.model.film.Film;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDao filmDao;

	@Override
	public Film findById(Integer idFilm) {

		return filmDao.findOne(idFilm);
		
	}

	@Override
	public Film findByTitle(String title) {
		
		return filmDao.findByTitle(title);
		
	}

}
