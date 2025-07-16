class ShareChatRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = ShareChat.isUserCreated("Aishwarya", "aishwarya@sharechat.com", 91, "Share@123", "Share@123", 18, 4.3f, 9321000000L);
		System.out.println("Is ShareChat Account Created: " + accountIsCreated);

		if (accountIsCreated) ShareChat.getUserAccount();
	}
}
