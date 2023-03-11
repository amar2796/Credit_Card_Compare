package com.cdac.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
