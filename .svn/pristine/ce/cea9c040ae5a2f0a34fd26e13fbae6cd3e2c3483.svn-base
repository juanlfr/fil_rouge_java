package fr.ibformation.filrouge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.beans.Reservation;
import fr.ibformation.filrouge.dao.ReservationDao;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	@Override
	public Reservation createOrUpdate(Reservation reservation) {
		return reservationDao.save(reservation);
		
	}

}
