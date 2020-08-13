package fr.ibformation.filrouge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.beans.Salle;
import fr.ibformation.filrouge.dao.SalleDao;

@Service
public class SalleServiceImpl implements SalleService {

	@Autowired
	private SalleDao salleDao;

	@Override
	public List<Salle> findAll() {
		List<Salle> listeDeSalles = (List<Salle>) salleDao.findAll();
		return listeDeSalles;
	}
}
