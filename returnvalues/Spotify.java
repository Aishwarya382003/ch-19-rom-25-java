class Spotify {

    static String userName;
    static String subscriptionType;
    static long mobileNumber;
    static String emailId;
    static String password;

    public static boolean registerUser(String uName, String subType, long mobile, String email, String pswd) {
        boolean isUserRegistered = false;
        boolean nameValid = false;
        boolean typeValid = false;
        boolean mobileValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (uName != null) {
            userName = uName;
            nameValid = true;
        }

        if (subType != null) {
            subscriptionType = subType;
            typeValid = true;
        }

        if (mobile != 0 && email != null) {
            mobileNumber = mobile;
            emailId = email;
            mobileValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (nameValid && typeValid && mobileValid && emailValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Username: " + userName);
        System.out.println("Subscription: " + subscriptionType);
        System.out.println("Mobile & Email: " + mobileNumber + ", " + emailId);
        System.out.println("Password: " + password);
    }
}
