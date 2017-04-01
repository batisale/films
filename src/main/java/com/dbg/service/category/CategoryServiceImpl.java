package com.dbg.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.category.CategoryDao;
import com.dbg.model.category.Category;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public Category findById(Integer idCategory) {
		
		return categoryDao.findOne(idCategory);
		
	}
	
}
