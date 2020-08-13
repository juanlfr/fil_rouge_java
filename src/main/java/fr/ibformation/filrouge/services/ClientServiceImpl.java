package fr.ibformation.filrouge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.dao.ClientDao;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDao clientDao;
}
