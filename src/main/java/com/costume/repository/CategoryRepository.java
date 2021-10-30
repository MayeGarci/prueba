/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costume.repository;


import com.costume.model.Category;
import com.costume.repository.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *esta clase accede a la interfaz
 * @author User
 */
@Repository
public class CategoryRepository{
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;
  /**
 *
 * @return
 */
    public List<Category> getAll() {
      return (List<Category>) categoryCrudRepository.findAll();
     
    }

    public Category save(Category category) {
        return null;
    }

    public Optional<Category> getCategory(Integer integer) {
        return null;
    }

    public void delete(Category get) {
        
    }
}
