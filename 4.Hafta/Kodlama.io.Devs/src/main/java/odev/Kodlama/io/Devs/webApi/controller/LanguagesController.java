package odev.Kodlama.io.Devs.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import odev.Kodlama.io.Devs.business.abstracts.LanguageService;
import odev.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
 
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getById")
	public Language getById(int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);

	}
	
	@GetMapping("/update")
	public void update(Language language) throws Exception {
		languageService.update(language);
		
	}
	
	@GetMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);

	}
}
