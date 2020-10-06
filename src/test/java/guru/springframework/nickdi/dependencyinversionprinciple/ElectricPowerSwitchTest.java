package guru.springframework.nickdi.dependencyinversionprinciple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectricPowerSwitchTest {

	@Test
	void test() {
		
		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		
		Switchable switchFan = new Fan();
		Switch fanPowerSwitch = new ElectricPowerSwitch(switchFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();
		
		Switchable switchRCCar = new RemoteControllCar();
		Switch rcCarPowerSwitch = new ElectricPowerSwitch(switchRCCar);
		rcCarPowerSwitch.press();
		rcCarPowerSwitch.press();
		
	}

}
