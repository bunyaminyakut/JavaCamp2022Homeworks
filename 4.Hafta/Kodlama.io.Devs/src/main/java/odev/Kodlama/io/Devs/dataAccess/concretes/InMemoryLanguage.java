package odev.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import odev.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import odev.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguage implements LanguageRepository {

	List<Language> languages = new ArrayList<>();

	public InMemoryLanguage() {
		languages.add(new Language(1, "java"));
		languages.add(new Language(2, "Python"));
		languages.add(new Language(3, "C#"));
	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public Language getById(int id) {
		
		Language languageById=null;
		
		for(Language lang: languages) {
			if(lang.getId() == id) {
				languageById = lang;
			}
		}
		if(languageById != null) {
			return languageById;
		}
		throw null;
	}

	@Override
	public void add(Language language) {
		int lastId = languages.get(languages.size() - 1).getId();
		language.setId(lastId + 1);
		languages.add(language);
		
	}

	@Override
	public void update(Language language) {
		for (Language lang: languages) {
			if(lang.getId() == language.getId()) {
				lang.setName(language.getName());
				break;
			}
		}
	}

	@Override
	public void delete(int id) {
		Language deleteTo = getById(id);
		if(deleteTo != null) {
			languages.remove(deleteTo);
			return;
		}
		throw null;
		
	}

}
