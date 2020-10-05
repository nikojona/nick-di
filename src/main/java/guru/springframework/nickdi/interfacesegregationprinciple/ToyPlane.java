package guru.springframework.nickdi.interfacesegregationprinciple;

public class ToyPlane implements Toy, Movable, Flyable {
	private double price;
	private String color;
	
	@Override
	public void fly() {

		System.out.println("ToyPlane: Start flying the plane.");
	}
	
	@Override
	public void move() {
		
		System.out.println("ToyPlane: Start moving the plane.");
	}
	
	@Override
	public void setPrice(double price) {

		this.price = price;
	}
	
	@Override
	public void setColor(String color) {

		this.color = color;
	}

	@Override
	public String toString() {
		return "ToyPlane: Movable Toy Plane, Flyable Toy Plane, price=" + price + ", color='" + color + '\'';
	}
	
	
}
