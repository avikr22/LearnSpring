package com.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exercise.service.JokeService;

@Controller
public class JokeController {

	private JokeService jokService;

	@Autowired
	public JokeController(JokeService jokService) {
		this.jokService = jokService;
	}

	@RequestMapping({ "/", "" })
	public String showJokes(Model model) {
		model.addAttribute("joke", jokService.getJoke());
		return "chucknorris";
	}
}
