package youTubeDemo;

public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creCreditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager)
	{
		_customer = customer;
		_creCreditManager = creditManager;
	}
	
	public void Save()
	{
		System.out.println("Müşteri Kaydedildi " + _customer.id);
	}
	
	public void Delete()
	{
		System.out.println("Müşteri Silindi " + _customer.id);
	}
	
	public void GiveCredit()
	{
		_creCreditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
}
