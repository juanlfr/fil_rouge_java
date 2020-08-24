package fr.ibformation.filrouge.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.filrouge.beans.Category;
import fr.ibformation.filrouge.services.CategoryService;

@CrossOrigin
@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List <Category> getCategories() {
		List<Category> categories = categoryService.findAll();
		return categories;
		
	}

}
