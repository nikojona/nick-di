package guru.springframework.nickdi.opencloseprinciple;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

	@Override
	public boolean isValidClaim() {
		
		System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        
//		Logic to validate health insurance claims
		
		return true;
	}
	
	
}
