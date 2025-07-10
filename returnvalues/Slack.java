class Slack {

    static String teamName;
    static String userName;
    static long phoneNumber;
    static String email;
    static String password;

    public static boolean registerUser(String team, String user, long phone, String mail, String pswd) {
        boolean isUserRegistered = false;
        boolean teamValid = false;
        boolean userValid = false;
        boolean phoneValid = false;
        boolean emailValid = false;
        boolean passValid = false;

        if (team != null) {
            teamName = team;
            teamValid = true;
        }

        if (user != null) {
            userName = user;
            userValid = true;
        }

        if (phone != 0 && mail != null) {
            phoneNumber = phone;
            email = mail;
            phoneValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passValid = true;
        }

        if (teamValid && userValid && phoneValid && emailValid && passValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Username: " + userName);
        System.out.println("Phone & Email: " + phoneNumber + ", " + email);
        System.out.println("Password: " + password);
    }
}
