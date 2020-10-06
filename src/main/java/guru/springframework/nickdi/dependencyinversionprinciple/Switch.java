package guru.springframework.nickdi.dependencyinversionprinciple;

public interface Switch {
	
	boolean isOn();
	void press(); // set as void because it's interface from an action
}
