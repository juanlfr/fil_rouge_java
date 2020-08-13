package fr.ibformation.filrouge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.filrouge.beans.Language;
import fr.ibformation.filrouge.dao.LanguageDao;

@Service
public class LanguageServiceImpl implements LanguageService{
	
	@Autowired
	 private LanguageDao languageDao;

	@Override
	public List<Language> findAll() {
		return (List<Language>) languageDao.findAll();
	}

}
