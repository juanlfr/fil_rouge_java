package fr.ibformation.filrouge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import fr.ibformation.filrouge.beans.Seance;
import fr.ibformation.filrouge.dao.SeanceDao;

@Service
public class SeanceServiceImpl implements SeanceService {
	
	@Autowired
	private SeanceDao seanceDao;

	@Override
	public List<Seance> findAll() {
		List<Seance> listeSeances = (List<Seance>) seanceDao.findAll();
		return listeSeances;
	}

	@Override
	public Seance createOrUpdate(Seance seance) {
		return seanceDao.save(seance);
	}

	
	public List<Seance> findSeancesByFilm(int filmId) {
		return seanceDao.findAllByFilmId(filmId);
		
	}

	

}
