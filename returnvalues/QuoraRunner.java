class QuoraRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        boolean success = Quora.registerUser("Rahul", "Kumar", 9008007006L, "rahul@quora.com", "Quora@2025");

        if (success) {
            System.out.println("User registered successfully.");
            Quora.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
