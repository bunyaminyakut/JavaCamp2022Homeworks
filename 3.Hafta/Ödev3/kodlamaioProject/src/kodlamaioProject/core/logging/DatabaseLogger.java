package kodlamaioProject.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void Log(String data) {
		System.out.println("Veritabanına Loglandı: " + data);
		
	}

}
