package example.bean;

public class UserValidator {
	public static boolean isValid(User ongoinguser) {
		boolean valid=false;
		String uName=ongoinguser.getUsername();
		String uPassword=ongoinguser.getPassword();
		if (uName.equals("Yash") && uPassword.equals("Yash123"))
			valid=true;
			return valid;
	}

}
