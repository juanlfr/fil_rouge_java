package fr.ibformation.filrouge.controlers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.filrouge.beans.Film;
import fr.ibformation.filrouge.services.CategoryService;
import fr.ibformation.filrouge.services.FilmService;
import fr.ibformation.filrouge.services.LanguageService;

@CrossOrigin
@RestController
public class FilmControler {

	@Autowired
	private FilmService filmService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/liste")
	public List<Film> liste() {
		List<Film> liste = filmService.findAll();
		//ModelAndView mav = new ModelAndView("listeFilm");
		//mav.addObject("liste", liste);
		return liste;
	}
	@GetMapping("/liste/{id}")
	public Optional<Film> findFilm(@PathVariable("id") int id) {
		Optional<Film> film = filmService.findById(id);
		return film;
	}
	
	@GetMapping("/ajouter")
	public ModelAndView ajouter() {
		ModelAndView mav = new ModelAndView("ajouterFilm");
		mav.addObject("film", new Film());
		mav.addObject("categorys", categoryService.findAll());
		mav.addObject("language", languageService.findAll());
		return mav;
	}
	
	@PostMapping ("/ajouter")
	public Film creerFilm(/*@ModelAttribute ("film")*/@RequestBody Film film) {
		//ModelAndView mav = new ModelAndView ("ajouterFilm");
		Film newFilm = new Film();
		System.out.println(film);
		if (film != null) {
			newFilm = filmService.createOrUpdate(film);			
		}
		else {
			System.out.println("object null");
		}
		/*mav.addObject("film", new Film());
		mav.addObject("categorys", categoryService.findAll());
		mav.addObject("language", languageService.findAll());
		return mav;*/
		return newFilm;
	}
	
	/*
	@PostMapping("/liste")
    public ModelAndView liste(@RequestParam("id") Integer id) {
        filmService.deleteById(id);
        return liste();
    }
    */

}
