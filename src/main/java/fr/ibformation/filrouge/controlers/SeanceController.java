package fr.ibformation.filrouge.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.filrouge.beans.Seance;
import fr.ibformation.filrouge.services.FilmService;
import fr.ibformation.filrouge.services.SalleService;
import fr.ibformation.filrouge.services.SeanceService;
@CrossOrigin
@RestController
public class SeanceController {
	
	@Autowired
	private SeanceService seanceService;
	@Autowired
	private FilmService filmService;
	@Autowired
	private SalleService salleService;
	
	@GetMapping("/liste-seances")
	public List<Seance> liste(){
	//public ModelAndView liste() {
		List<Seance> liste = seanceService.findAll();
		//ModelAndView mav = new ModelAndView("listeSeances");
		//mav.addObject("listeDeSeances", liste);
		//return mav;
		return liste;
	}
	
	@GetMapping("/liste-seances/{filmId}")
	public List<Seance> listeSeancesDuFilm(@PathVariable int filmId){
		List<Seance> liste = seanceService.findSeancesByFilm(filmId);
		return liste;
	}
	
	@GetMapping("/ajouter-seance")
	public ModelAndView ajouterSeance() {
		ModelAndView mav = new ModelAndView("ajouterSeance");
		mav.addObject("seance", new Seance());
		mav.addObject("films", filmService.findAll());
		mav.addObject("salles", salleService.findAll());
		return mav;
	}
	
	@PostMapping ("/creationSeance")
	public ModelAndView creerSeance(@ModelAttribute ("seance") Seance seance) {
		seanceService.createOrUpdate(seance);
		return ajouterSeance();
	}
	
}
