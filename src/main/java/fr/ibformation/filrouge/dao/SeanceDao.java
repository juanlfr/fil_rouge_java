package fr.ibformation.filrouge.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.filrouge.beans.Seance;

public interface SeanceDao extends CrudRepository<Seance, Integer> {

	List<Seance> findAllByFilmId(int filmId);

}
