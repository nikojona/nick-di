package guru.springframework.nickdi.insurance;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {

	@Override
	public boolean isValidClaim() {
		
		System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        
//		Logic to validate Vehicle insurance claims
		
		return true;
	}
	
	
}
