package com.dbg.model.evaluation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dbg.model.film.Film;
import com.dbg.model.user.User;


@Entity
@Table(name = "evaluation")
public class Evaluation implements Serializable {

	private static final long serialVersionUID = -8926502237214077649L;

	@Id
	@GeneratedValue
	private Integer id;

	private Integer points;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Film film;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

}