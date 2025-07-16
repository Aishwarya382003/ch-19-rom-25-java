class HeloRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Helo.isUserCreated("Aishwarya", "aishwarya@helo.com", 91, "Helo@123", "Helo@123", 19, 4.5f, 9090909090L);
		System.out.println("Is Helo Account Created: " + accountIsCreated);

		if (accountIsCreated) Helo.getUserAccount();
	}
}
