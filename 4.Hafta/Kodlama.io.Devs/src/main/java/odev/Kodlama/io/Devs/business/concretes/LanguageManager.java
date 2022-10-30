package odev.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import odev.Kodlama.io.Devs.business.abstracts.LanguageService;
import odev.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import odev.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository; 
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}


	@Override
	public void add(Language language) throws Exception {
		Empty(language);
		languageRepository.add(language);
	}


	@Override
	public void update(Language language)  throws Exception{
		Empty(language);
		languageRepository.update(language);
	}


	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}


	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}
	
	private void Empty(Language language) throws Exception {
		if(language.getName() == "")
			throw new Exception("Dil boş bırakılmaz");
		var languages = languageRepository.getAll();
		
		for (Language language1 : languages) {
			if (language1.getName() == language.getName()) {
				throw new Exception("İsim tekrar edemez");
			}
		}
	}

}
