class TrelloRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        boolean isRegistered = Trello.registerUser("MarketingBoard", "Simran", 7788990011L, "simran@trello.com", "Trello@789");

        if (isRegistered) {
            System.out.println("User registered successfully.");
            Trello.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
