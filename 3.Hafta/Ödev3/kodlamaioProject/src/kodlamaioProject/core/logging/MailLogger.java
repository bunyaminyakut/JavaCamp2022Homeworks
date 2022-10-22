package kodlamaioProject.core.logging;

public class MailLogger implements Logger{

	@Override
	public void Log(String data) {
		System.out.println("Maile Loglandı: " + data);
		
	}

}
