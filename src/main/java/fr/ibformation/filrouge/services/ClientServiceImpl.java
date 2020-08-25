package fr.ibformation.filrouge.services;
import fr.ibformation.filrouge.beans.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.ibformation.filrouge.dao.ClientDao;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDao clientDao;

	@Override
	public Iterable<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public Client createOrUpdate(Client client) {
		Client newClient = clientDao.save(client);
		return newClient;
	}
}
