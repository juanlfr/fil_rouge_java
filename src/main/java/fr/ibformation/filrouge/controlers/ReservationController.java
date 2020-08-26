package fr.ibformation.filrouge.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.filrouge.beans.Reservation;
import fr.ibformation.filrouge.services.ReservationService;
@CrossOrigin
@RestController
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/ajouterReservation")
	public ModelAndView ajouterReservation() {
		ModelAndView mav = new ModelAndView("ajouterReservation");
		mav.addObject("reservation", new Reservation());
		return mav;
	}
	
	@PostMapping ("/ajouterReservation")
	public Reservation creerReservation(/*@ModelAttribute ("reservation")*/@RequestBody Reservation reservation) {
		//ModelAndView mav = new ModelAndView ("ajouterReservation");
		Reservation newReservation = reservationService.createOrUpdate(reservation);
		return newReservation;
	}
}
