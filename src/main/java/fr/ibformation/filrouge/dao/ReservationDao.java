package fr.ibformation.filrouge.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.filrouge.beans.Reservation;

public interface ReservationDao extends CrudRepository<Reservation, Integer> {

}
