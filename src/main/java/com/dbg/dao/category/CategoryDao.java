package com.dbg.dao.category;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.dbg.model.category.Category;
@Repository
public interface CategoryDao extends PagingAndSortingRepository<Category, Integer>{
	public List<Category> findByName(String name);
}
