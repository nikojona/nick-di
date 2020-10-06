package guru.springframework.nickdi.dependencyinversionprinciple;

public class ElectricPowerSwitch implements Switch {
	
	public Switchable client;
	public boolean on;
	
	public ElectricPowerSwitch(Switchable client) {
		this.client = client;
	}

	@Override
	public boolean isOn() {
		
		return this.on; // you can set the variable as new function
	}

	@Override
	public void press() {

		boolean checkOn = isOn();
		
		if (checkOn) {
			client.turnOff();
			this.on = false;
		} else {
			client.turnOn();
			this.on = true;
		}
	}
	
}
