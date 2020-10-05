package guru.springframework.nickdi.insurance;

public class ClaimApprovalManager {
	
	public void processClaim(InsuranceSurveyor surveyor) {
		
		if(surveyor.isValidClaim()) {
			
			System.out.println("ClaimApprovalManager: valid claim, currently processing claim for approval...");
		}
	}
}
