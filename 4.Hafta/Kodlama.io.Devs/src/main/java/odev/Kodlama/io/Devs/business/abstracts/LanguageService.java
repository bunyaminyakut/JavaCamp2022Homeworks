package odev.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import odev.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language getById(int id);
	void add(Language language) throws Exception;;
	void update(Language language)throws Exception; ;
	void delete(int id);
}
