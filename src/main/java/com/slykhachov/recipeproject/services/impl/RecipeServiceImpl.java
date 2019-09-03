package com.slykhachov.recipeproject.services.impl;

import com.slykhachov.recipeproject.domain.Recipe;
import com.slykhachov.recipeproject.repositories.RecipeRepository;
import com.slykhachov.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public Set<Recipe> getRecipes() {
        log.debug("DEBUG MESSAGE");
        return StreamSupport.stream(recipeRepository.findAll().spliterator(), false)
                .collect(Collectors.toSet());
    }
}
