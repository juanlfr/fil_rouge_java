package fr.ibformation.filrouge.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.filrouge.beans.Category;

public interface CategoryDao extends CrudRepository<Category, Integer> {

}
