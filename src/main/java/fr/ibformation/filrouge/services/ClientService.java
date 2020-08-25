package fr.ibformation.filrouge.services;

import java.util.List;
import fr.ibformation.filrouge.beans.Client;

public interface ClientService {

	Iterable<Client> findAll();

	Client createOrUpdate(Client client);
	
	

}
