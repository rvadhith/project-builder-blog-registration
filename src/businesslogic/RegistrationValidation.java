package businesslogic;


public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		boolean emailValidityCheck = validEmail(email);
		boolean passwordValidityCheck = validPassword(password,confirmPassword);
		if(emailValidityCheck && passwordValidityCheck) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean validPassword(String password, String confirmPassword) {
	
		int upper = 0;
		int lower = 0;
		int numbers = 0;
		char passwordCharacterArray[]= password.toCharArray();
		
		if(password.length() == 0) {
			return false;
		}
		else if(password != confirmPassword) {
			return false;
		}
		else if(password.length() < 8 && password.length() > 20) {
			return false;
		}
		else {
			for (int i = 0; i < passwordCharacterArray.length; i++){
				if(passwordCharacterArray[i] > 64 && passwordCharacterArray[i] < 91) {
					upper++;
				}
					
				if(passwordCharacterArray[i] > 96 && passwordCharacterArray[i] < 123) {
					lower++;
				}
					
				if(passwordCharacterArray[i] > 47 && passwordCharacterArray[i] < 58) {
					numbers++;
				}
			}
			if(upper > 0 && lower > 0 && numbers > 0) {
				return true;
			}
			else {
				return false;
			}	
		}
		
	}
	
	//Email Validation
	private boolean validEmail(String email) {
		String emailValidationRegex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        boolean emailValidation = email.matches(emailValidationRegex);
		return emailValidation;
	}
}	