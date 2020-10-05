package guru.springframework.nickdi.interfacesegregationprinciple;

public class ToyBuilder {
	
	public static ToyHouse buildToyHouse() {
		
		ToyHouse toyHouse = new ToyHouse();
		toyHouse.setPrice(100000);
		toyHouse.setColor("White");
		
		return toyHouse;
	}
	
	public static ToyCar buildToyCar() {
		
		ToyCar toyCar = new ToyCar();
		toyCar.setPrice(65000);
		toyCar.setColor("Red");
		toyCar.move();
		
		return toyCar;
	}
	
	public static ToyPlane buildToyPlane() {
		
		ToyPlane toyPlane = new ToyPlane();
		toyPlane.setPrice(150000);
		toyPlane.setColor("Blue - White");
		toyPlane.move();
		toyPlane.fly();
		
		return toyPlane;
	}
	
}
