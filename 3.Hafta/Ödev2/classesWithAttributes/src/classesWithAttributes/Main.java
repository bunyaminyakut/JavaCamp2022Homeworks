package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "laptop", "Asus Laptop", 500, 2, "Siyah");
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
