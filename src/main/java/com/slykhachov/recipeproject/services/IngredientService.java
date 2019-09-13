package com.slykhachov.recipeproject.services;

import com.slykhachov.recipeproject.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    public IngredientCommand saveIngredientCommand(IngredientCommand command);

}
