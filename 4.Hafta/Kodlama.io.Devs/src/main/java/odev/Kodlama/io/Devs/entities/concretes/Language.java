package odev.Kodlama.io.Devs.entities.concretes;

public class Language {
	private int id;
	private String Name;


	public Language(int id, String name) {
		this.id = id;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
