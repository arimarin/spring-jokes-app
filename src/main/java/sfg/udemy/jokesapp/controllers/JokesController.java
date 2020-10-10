package sfg.udemy.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfg.udemy.jokesapp.services.JokesService;

/**
 * Created by Ari on 10.10.2020
 */
@Controller
public class JokesController {
	private JokesService jokesService;

	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping({"/", ""})
	public String getJoke(Model model) {
		model.addAttribute("joke", jokesService.getRandomJoke());

		return "chucknorris";
	}

	public void newJoke(Model model) {
		model.addAttribute("joke", jokesService.getRandomJoke());
	}
}
