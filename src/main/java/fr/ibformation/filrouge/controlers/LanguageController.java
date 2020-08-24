package fr.ibformation.filrouge.controlers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.ibformation.filrouge.beans.Language;
import fr.ibformation.filrouge.services.LanguageService;

@CrossOrigin
@RestController
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/languages")
	public List<Language> getLanguages() {
		List<Language> languages = languageService.findAll();
		return languages;
		
	}

}
