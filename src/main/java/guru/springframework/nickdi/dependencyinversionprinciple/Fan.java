package guru.springframework.nickdi.dependencyinversionprinciple;

public class Fan implements Switchable {

	@Override
	public void turnOff() {

		System.out.println("Fan: Fan turned off....");
	}

	@Override
	public void turnOn() {

		System.out.println("Fan: Fan turned on....");
	}
	
}
