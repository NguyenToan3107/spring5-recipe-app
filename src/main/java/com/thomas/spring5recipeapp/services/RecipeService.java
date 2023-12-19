package com.thomas.spring5recipeapp.services;

import com.thomas.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
