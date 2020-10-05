package guru.springframework.nickdi.opencloseprinciple;

public class ClaimApprovalManager {
	
	public void processClaim(InsuranceSurveyor surveyor) {
		
		if(surveyor.isValidClaim()) {
			
			System.out.println("ClaimApprovalManager: valid claim, currently processing claim for approval...");
		}
	}
}
