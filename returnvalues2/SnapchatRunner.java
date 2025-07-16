class SnapchatRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Snapchat.isUserCreated("Aishwarya", "aishwarya@snapchat.com", 91, "Snap@123", "Snap@123", 21, 4.7f, 9876543210L);
		System.out.println("Is Snapchat Account Created: " + accountIsCreated);

		if (accountIsCreated) Snapchat.getUserAccount();
	}
}
