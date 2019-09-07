package com.slykhachov.recipeproject.services;

import com.slykhachov.recipeproject.domain.Recipe;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

}
