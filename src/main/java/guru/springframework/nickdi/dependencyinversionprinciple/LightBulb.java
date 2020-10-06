package guru.springframework.nickdi.dependencyinversionprinciple;

public class LightBulb implements Switchable {

	@Override
	public void turnOff() {

		System.out.println("LighBulb: Buln turned off....");
	}

	@Override
	public void turnOn() {

		System.out.println("LighBulb: Buln turned on....");
	}
	
}
