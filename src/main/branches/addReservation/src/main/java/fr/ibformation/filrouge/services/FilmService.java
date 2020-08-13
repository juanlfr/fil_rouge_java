package fr.ibformation.filrouge.services;

import java.util.List;
import java.util.Optional;

import fr.ibformation.filrouge.beans.Film;

public interface FilmService {

	public List<Film> findAll();

	public Film createOrUpdate(Film film);

	public Optional<Film> findById(int id);

	public void deleteById(Integer id);
	
	

}
