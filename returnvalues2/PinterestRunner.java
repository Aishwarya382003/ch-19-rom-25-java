class PinterestRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Pinterest.isUserCreated("Aishwarya", "aishwarya@pinterest.com", 91, "Pin@123", "Pin@123", 22, 4.5f, 9112233445L);
		System.out.println("Is Pinterest Account Created: " + accountIsCreated);

		if (accountIsCreated) Pinterest.getUserAccount();
	}
}
