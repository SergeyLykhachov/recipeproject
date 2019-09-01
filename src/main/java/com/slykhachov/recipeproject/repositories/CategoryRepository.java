package com.slykhachov.recipeproject.repositories;

import com.slykhachov.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
