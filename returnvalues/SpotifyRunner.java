class SpotifyRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        boolean isRegistered = Spotify.registerUser("melody_user", "Premium", 9911223344L, "melody@gmail.com", "Melody@123");

        if (isRegistered) {
            System.out.println("User registered successfully.");
            Spotify.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
