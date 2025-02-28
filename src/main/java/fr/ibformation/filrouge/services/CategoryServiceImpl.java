package fr.ibformation.filrouge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.beans.Category;
import fr.ibformation.filrouge.dao.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> findAll() {
		return (List<Category>) categoryDao.findAll();
	}

	@Override
	public Category createOrUpdate(Category category) {
		return categoryDao.save(category);
	}

}
