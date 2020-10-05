package guru.springframework.nickdi.insurance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The package class insurance is for example Open Close Principle terminology
 * You can see the explanation in Course content: 43. Open Closed Principle
 * at https://www.udemy.com/course/spring-framework-5-beginner-to-guru/learn/lecture/17855112#notes
 * @author nikojona
 *
 */
class ClaimApprovalManagerTest {
	
	@Test
	void testProcessClaim() {
		
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		ClaimApprovalManager claimApprovalForHealth = new ClaimApprovalManager();
		claimApprovalForHealth.processClaim(healthInsuranceSurveyor);
		
		VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager claimApprovalforVehicle = new ClaimApprovalManager();
		claimApprovalforVehicle.processClaim(vehicleInsuranceSurveyor);
	}

}
