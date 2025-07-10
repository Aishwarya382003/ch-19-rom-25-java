class SlackRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        boolean registered = Slack.registerUser("DevTeam", "john_doe", 8877665544L, "john@devteam.com", "SlackDev123");

        if (registered) {
            System.out.println("User registered successfully.");
            Slack.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
