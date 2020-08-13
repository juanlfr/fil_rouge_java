package fr.ibformation.filrouge.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AccueilControler {

	@GetMapping("/accueil")
	public ModelAndView accueil() {
		return new ModelAndView("accueil");
	}

}