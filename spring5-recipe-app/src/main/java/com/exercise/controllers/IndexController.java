package com.exercise.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exercise.domain.Category;
import com.exercise.domain.UnitOfMeasure;
import com.exercise.repositories.CategoryRepository;
import com.exercise.repositories.UnitOfMeasureRepository;
import com.exercise.service.RecipeService;

@Controller
public class IndexController {
	private final RecipeService recipeService;
	
	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
