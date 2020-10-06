package guru.springframework.nickdi.dependencyinversionprinciple;

public class RemoteControllCar implements Switchable {

	@Override
	public void turnOff() {

		System.out.println("RC Car: RC Car turned off....");
	}

	@Override
	public void turnOn() {

		System.out.println("RC Car: RC Car turned on....");
	}
	
}
