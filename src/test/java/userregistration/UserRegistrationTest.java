package userregistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();
	boolean result;
	
	@Test
	public void firstNamePass() throws UserRegistrationException {
		
		result = userRegistration.validFirstname("Ashok");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void lastNamePass() throws UserRegistrationException {
		result = userRegistration.validLastname("Koda");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void EmailPass() throws UserRegistrationException {
		result = userRegistration.validEmail("a.koda59@gmail.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNoPass() throws UserRegistrationException {
		result = userRegistration.isMobileNumber("91 7396382673");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void passwordPass() throws UserRegistrationException {
		result = userRegistration.isValidPassword("Koda@1996");
		Assert.assertEquals(true,result);
	}
}
