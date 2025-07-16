class Clubhouse {

	static String profileName;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float voiceRating;
	static long mobileNumber;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean nameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (name != null) {
			profileName = name;
			nameValid = true;
		} else {
			System.out.println("Profile Name is required.");
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
			System.out.println("Password mismatch.");
		}

		if (userAge >= 17) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("Minimum age is 17.");
		}

		if (rating > 0.0f) {
			voiceRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Voice rating must be valid.");
		}

		if (phone > 0) {
			mobileNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Mobile number is required.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Clubhouse Profile Name: " + profileName);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Voice Rating: " + voiceRating);
		System.out.println("Mobile Number: " + mobileNumber);
	}
}

