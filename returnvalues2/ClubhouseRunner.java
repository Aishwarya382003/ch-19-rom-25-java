class ClubhouseRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Clubhouse.isUserCreated("Aishwarya", "aishwarya@clubhouse.com", 91, "Club@321", "Club@321", 19, 4.9f, 9988994455L);
		System.out.println("Is Clubhouse Account Created: " + accountIsCreated);

		if (accountIsCreated) Clubhouse.getUserAccount();
	}
}
