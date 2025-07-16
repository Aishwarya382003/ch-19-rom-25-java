class MojRunner {
	public static void main(String[] args) {
		boolean isUserRegistered = Moj.isUserCreated(null, "aishwarya@moj.com", 91, null, "Moj@123", 20, 4.2f, 9870001234L);
		System.out.println("Is Moj User Registered: " + isUserRegistered);

		if (isUserRegistered) Moj.getUserInfo();
	}
}