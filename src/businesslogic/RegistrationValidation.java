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
		else if(password.length() <= 7 || password.length() >= 20) {
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
	
	//Email Validation with as well as without regex
	private boolean validEmail(String email) {
		//String emailValidationRegex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        //boolean emailValidation = email.matches(emailValidationRegex);
		//return emailValidation;
		char emailCharacterArray[]= email.toCharArray();
		if(email.length() > 0) {
			if((email.contains("@") && email.contains(".")) || email.contains("_")) {
				for (int i = 0; i < emailCharacterArray.length; i++) {
					if((emailCharacterArray[i] > 64 && emailCharacterArray[i] < 91) || (emailCharacterArray[i] > 96 && emailCharacterArray[i] < 123) || (emailCharacterArray[i] > 47 && emailCharacterArray[i] < 58) || emailCharacterArray[i] == 64 || emailCharacterArray[i] == 95 || emailCharacterArray[i] == 46) {
						return true;
					}
				}
			}			
		}
		return false;
	}
}	