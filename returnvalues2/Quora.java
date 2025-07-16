class Quora {

	static String username;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float answerRating;
	static long mobile;

	public static boolean isUserCreated(String uname, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean unameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (uname != null) {
			username = uname;
			unameValid = true;
		} else {
			System.out.println("Username is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;
			if (mail != null) emailValid = true;
		} else {
			System.out.println("Email or Phone Code is required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password is required.");
		}

		if (cpswd != null && cpswd ==pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords do not match.");
		}

		if (userAge >= 16) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("Minimum age is 16.");
		}

		if (rating > 0.0f) {
			answerRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Rating must be positive.");
		}

		if (phone > 0) {
			mobile = phone;
			phoneValid = true;
		} else {
			System.out.println("Valid mobile number required.");
		}

		if (unameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Quora Username: " + username);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Answer Rating: " + answerRating);
		System.out.println("Mobile: " + mobile);
	}
}


