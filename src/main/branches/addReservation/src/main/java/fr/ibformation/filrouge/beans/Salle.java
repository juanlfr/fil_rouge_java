package fr.ibformation.filrouge.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int nbrePlaceMax;
	private String nom;
	@ManyToMany (cascade = CascadeType.ALL)
	private List<Cinema> cinemas;
	
	public List<Cinema> getCinemas(){
		return cinemas;
	}
	
	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

	public Salle(String nom, int nbrePlaceMax, List<Cinema> cinemas) {
		super();
		this.nom = nom;
		this.nbrePlaceMax = nbrePlaceMax;
		this.cinemas = cinemas;
	}
}
