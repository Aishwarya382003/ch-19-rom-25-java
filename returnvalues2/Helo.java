class Helo {

	static String userHandle;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float postRating;
	static long mobile;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean handleValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (name != null) {
			userHandle = name;
			handleValid = true;
		} else {
			System.out.println("User handle is required.");
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
			System.out.println("Password cannot be empty.");
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
			System.out.println("Age must be 13 or above.");
		}

		if (rating > 0.0f) {
			postRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Invalid post rating.");
		}

		if (phone > 0) {
			mobile = phone;
			phoneValid = true;
		} else {
			System.out.println("Phone number is mandatory.");
		}

		if (handleValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Helo User Handle: " + userHandle);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirm Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Post Rating: " + postRating);
		System.out.println("Mobile: " + mobile);
	}
}

