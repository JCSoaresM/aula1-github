package course;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String nome, double preco) {
		this.name = nome;
		this.price = preco;
	}
	
	public Product(String nome, double preco, int quantidade) {
		this.name = nome;
		this.price = preco;
		this.quantity = quantidade;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return quantity*price;
	}
	
	public void AddProducts(int qtd) {
		this.quantity += qtd;
	}
	
	public void RemoveProducts(int qtd) {
		this.quantity -= qtd;
	}

		
}
