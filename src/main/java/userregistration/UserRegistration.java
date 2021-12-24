package userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validFirstname(String fname) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{3,}");
		Matcher matcher = pattern.matcher(fname);

		if (!matcher.find()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean validLastname(String lname) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{3,}");
		Matcher matcher = pattern.matcher(lname);

		if (!matcher.find()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean validEmail(String email) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$");
		Matcher matcher = pattern.matcher(email);

		if (!matcher.find()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isMobileNumber(String phone) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^[0-9]{2}+[ ][0-9]{10}$");
		Matcher matcher = pattern.matcher(phone);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}
	
	public boolean isValidPassword(String password) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$");
		Matcher matcher = pattern.matcher(password);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}
}
