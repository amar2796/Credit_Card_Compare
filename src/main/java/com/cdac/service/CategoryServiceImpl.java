package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CategoryRepo;
import com.cdac.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public List<Category> getAllCategories() {
		return (List<Category>) categoryRepo.findAll();
	}

	@Override
	public Optional<Category> getCategory(Integer Id) {
		return categoryRepo.findById(Id);
	}

}
