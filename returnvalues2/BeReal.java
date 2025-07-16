class BeReal {

	static String realName;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float honestyRating;
	static long phoneNumber;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isUserRegistered = false;
		boolean nameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (name != null) {
			realName = name;
			nameValid = true;
		} else {
			System.out.println("Name is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;
			if (mail != null) emailValid = true;
		} else {
			System.out.println("Email or phone code required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password missing.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Password mismatch.");
		}

		if (userAge >= 16) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("User must be 16+.");
		}

		if (rating > 0.0f) {
			honestyRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Honesty rating must be positive.");
		}

		if (phone > 0) {
			phoneNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Phone is required.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isUserRegistered = true;
		}
		return isUserRegistered;
	}

	public static void getUserInfo() {
		System.out.println("BeReal Name: " + realName);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirm Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Honesty Rating: " + honestyRating);
		System.out.println("Phone Number: " + phoneNumber);
	}
}


