class QuoraRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Quora.isUserCreated("Aishwarya", "aishwarya@quora.com", 91, "Quora@321", "Quora@321", 20, 4.6f, 9011009988L);
		System.out.println("Is Quora Account Created: " + accountIsCreated);

		if (accountIsCreated) Quora.getUserAccount();
	}
}