package com.exercise.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exercise.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
