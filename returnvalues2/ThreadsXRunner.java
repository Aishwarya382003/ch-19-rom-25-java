class ThreadsXRunner {
	public static void main(String[] args) {
		boolean isUserRegistered = ThreadsX.isUserCreated("Aishwarya", "aishwarya@threadsx.com", 91, "Threads@2025", "Threads@2025", 21, 4.6f, 9345612390L);
		System.out.println("Is ThreadsX User Registered: " + isUserRegistered);

		if (isUserRegistered) ThreadsX.getUserInfo();
	}
}
