class ThreadsX {

	static String accountName;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float threadScore;
	static long mobile;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float score, long phone) {
		boolean isUserRegistered = false;
		boolean nameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean scoreValid = false;
		boolean phoneValid = false;

		if (name != null) {
			accountName = name;
			nameValid = true;
		} else {
			System.out.println("Account Name is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;
			if (mail != null) emailValid = true;
		} else {
			System.out.println("Provide email or phone code.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password is needed.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords mismatch.");
		}

		if (userAge >= 13) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("Minimum age is 13.");
		}

		if (score > 0.0f) {
			threadScore = score;
			scoreValid = true;
		} else {
			System.out.println("Thread score must be valid.");
		}

		if (phone > 0) {
			mobile = phone;
			phoneValid = true;
		} else {
			System.out.println("Mobile number required.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && scoreValid && phoneValid) {
			isUserRegistered = true;
		}
		return isUserRegistered;
	}

	public static void getUserInfo() {
		System.out.println("ThreadsX Account Name: " + accountName);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirm Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Thread Score: " + threadScore);
		System.out.println("Mobile: " + mobile);
	}
}

