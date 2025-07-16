class Snapchat {

	static String displayName;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float snapScore;
	static long mobileNumber;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float score, long phone) {
		boolean isAccountCreated = false;
		boolean nameValid = false;
		boolean contactValid = false;
		boolean emailValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean scoreValid = false;
		boolean phoneValid = false;

		if (name != null) {
			displayName = name;
			nameValid = true;
		} else {
			System.out.println("Display name is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;
			if (mail != null) emailValid = true;
		} else {
			System.out.println("Email or Phone Code must be provided.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password is required.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords do not match.");
		}

		if (userAge >= 13) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("Minimum age is 13.");
		}

		if (score > 0.0f) {
			snapScore = score;
			scoreValid = true;
		} else {
			System.out.println("Snap score must be positive.");
		}

		if (phone > 0) {
			mobileNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Mobile number is required.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && scoreValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Snapchat Display Name: " + displayName);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Snap Score: " + snapScore);
		System.out.println("Mobile Number: " + mobileNumber);
	}
}

