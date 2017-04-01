package com.dbg.model.category;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbg.model.film.Film;

@Entity
@Table(name = "category")
public class Category implements Serializable {

	private static final long serialVersionUID = -6850865486572251075L;

	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	
	@OneToMany
	(mappedBy = "category")
	private List<Film> films = new ArrayList<>();

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}