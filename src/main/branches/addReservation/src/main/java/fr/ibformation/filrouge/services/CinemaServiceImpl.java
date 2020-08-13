package fr.ibformation.filrouge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.dao.CinemaDao;

@Service
public class CinemaServiceImpl implements CinemaService{

	@Autowired
	private CinemaDao cinemaDao;
}
