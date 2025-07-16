class LikeeRunner {
	public static void main(String[] args) {
		boolean isUserRegistered = Likee.isUserCreated("Aishwarya", "aishwarya@likee.com", 91, "Likee@321", "Likee@321", 21, 4.1f, 9333344455L);
		System.out.println("Is Likee User Registered: " + isUserRegistered);

		if (isUserRegistered) Likee.getUserInfo();
	}
}