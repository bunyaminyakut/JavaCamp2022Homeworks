package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager(new Person(),new TeacherCreditManager());
		customerManager.GiveCredit();
		
	
	}

}
