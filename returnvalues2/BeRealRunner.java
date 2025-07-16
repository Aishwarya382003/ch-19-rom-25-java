class BeRealRunner {
	public static void main(String[] args) {
		boolean isUserRegistered = BeReal.isUserCreated("Aishwarya", "aishwarya@bereal.com", 91, "BeReal@123", "BeReal@123", 18, 4.9f, 9999988888L);
		System.out.println("Is BeReal User Registered: " + isUserRegistered);

		if (isUserRegistered) BeReal.getUserInfo();
	}
}