package com.cdac.service;

import java.util.List;
import java.util.Optional;

import com.cdac.model.Category;

public interface CategoryService {
	List<Category> getAllCategories();
	Optional<Category> getCategory(Integer Id);
	
}
