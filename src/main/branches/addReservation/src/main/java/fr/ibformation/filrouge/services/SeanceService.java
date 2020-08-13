package fr.ibformation.filrouge.services;

import java.util.List;

import fr.ibformation.filrouge.beans.Seance;

public interface SeanceService {

	public List<Seance> findAll();

	public Seance createOrUpdate(Seance seance);

	public List<Seance> findSeancesByFilm(int filmId);
	

}
