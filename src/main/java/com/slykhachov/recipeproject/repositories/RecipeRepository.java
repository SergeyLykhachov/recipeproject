package com.slykhachov.recipeproject.repositories;

import com.slykhachov.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
