package fr.ibformation.filrouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.beans.Film;
import fr.ibformation.filrouge.dao.FilmDao;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmDao filmDao;

	@Override
	public List<Film> findAll() {
		return (List<Film>) filmDao.findAll();
	}

	@Override
	public Film createOrUpdate(Film film) {
		return filmDao.save(film);
	}

	@Override
	public Optional<Film> findById(int id) {
		Optional<Film> film = filmDao.findById(id);
		return film;
		
	}

	@Override
	public void deleteById(Integer id) {
		 filmDao.deleteById(id);
	}
}
