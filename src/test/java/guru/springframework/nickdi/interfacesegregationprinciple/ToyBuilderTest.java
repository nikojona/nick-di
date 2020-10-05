package guru.springframework.nickdi.interfacesegregationprinciple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToyBuilderTest {

	@Test
	void testBuildToyHouse() throws Exception {
		
		ToyHouse toyHouse = ToyBuilder.buildToyHouse();
		System.out.println(toyHouse);
	}

	@Test
	void testBuildToyCar() {
		
		ToyCar toyCar = ToyBuilder.buildToyCar();
		System.out.println(toyCar);
	}

	@Test
	void testBuildToyPlane() {
		
		ToyPlane toyPlane = ToyBuilder.buildToyPlane();
		System.out.println(toyPlane);
	}

}
