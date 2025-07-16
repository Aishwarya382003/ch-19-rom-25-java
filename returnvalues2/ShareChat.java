class ShareChat {

	static String nickname;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float profileRating;
	static long mobile;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean nicknameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (name != null) {
			nickname = name;
			nicknameValid = true;
		} else {
			System.out.println("Nickname is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;
			if (mail != null) emailValid = true;
		} else {
			System.out.println("Email or Phone code is required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Enter a password.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords don't match.");
		}

		if (userAge >= 13) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("Minimum age is 13.");
		}

		if (rating > 0.0f) {
			profileRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Profile rating must be valid.");
		}

		if (phone > 0) {
			mobile = phone;
			phoneValid = true;
		} else {
			System.out.println("Mobile number missing.");
		}

		if (nicknameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("ShareChat Nickname: " + nickname);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirm Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Profile Rating: " + profileRating);
		System.out.println("Mobile: " + mobile);
	}
}

