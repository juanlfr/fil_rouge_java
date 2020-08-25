package fr.ibformation.filrouge.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.filrouge.services.ClientService;
import fr.ibformation.filrouge.beans.Client;

@CrossOrigin
@RestController
public class clientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
	public Iterable<Client> getClients() {
		Iterable<Client> clients = clientService.findAll();
		return clients;
		
	}
	@PostMapping("/addClient")
	public Client createClient(@RequestBody Client client) {
		Client newClient = clientService.createOrUpdate(client);
		return newClient;
		
	}
}
