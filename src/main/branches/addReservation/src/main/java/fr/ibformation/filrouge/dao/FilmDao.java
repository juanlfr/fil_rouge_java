package fr.ibformation.filrouge.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.filrouge.beans.Film;

public interface FilmDao extends CrudRepository<Film, Integer> {

}
