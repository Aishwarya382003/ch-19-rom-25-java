class Likee {

	static String likeeName;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float creatorScore;
	static long mobile;

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
			likeeName = name;
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
			System.out.println("Email or Phone code required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password is missing.");
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
			System.out.println("Age must be 13+.");
		}

		if (rating > 0.0f) {
			creatorScore = rating;
			ratingValid = true;
		} else {
			System.out.println("Rating must be valid.");
		}

		if (phone > 0) {
			mobile = phone;
			phoneValid = true;
		} else {
			System.out.println("Mobile is mandatory.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isUserRegistered = true;
		}
		return isUserRegistered;
	}

	public static void getUserInfo() {
		System.out.println("Likee Username: " + likeeName);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirm Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Creator Score: " + creatorScore);
		System.out.println("Mobile: " + mobile);
	}
}


