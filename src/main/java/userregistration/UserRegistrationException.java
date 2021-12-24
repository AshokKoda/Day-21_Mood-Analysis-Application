package userregistration;

public class UserRegistrationException extends Exception {
	
	public enum ExceptionType
	{
		Invalid_Firstname,
		Invalid_Lastname,
		Invalid_Email,
		Invalid_Phone,
		Invalid_Password;
	}
	ExceptionType type;
	
	public UserRegistrationException(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}

}
