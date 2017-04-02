package com.dbg.dto;

import java.io.Serializable;

import com.dbg.model.evaluation.Evaluation;

public class EvaluationDTO implements Serializable{
	
	private static final long serialVersionUID = 7371198896371384890L;

	private Integer id;

	private int points;
	
	private String name;
	
	private String title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
