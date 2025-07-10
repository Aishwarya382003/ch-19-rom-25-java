class PinterestRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        boolean isRegistered = Pinterest.registerUser("Nikita", "nik_pins", 9898989898L, "nikita@pins.com", "Pins2024");

        if (isRegistered) {
            System.out.println("User registered successfully.");
            Pinterest.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
