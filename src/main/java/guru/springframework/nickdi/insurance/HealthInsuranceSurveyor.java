package guru.springframework.nickdi.insurance;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

	@Override
	public boolean isValidClaim() {
		
		System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        
//		Logic to validate health insurance claims
		
		return true;
	}
	
	
}
