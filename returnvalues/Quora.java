class Quora {

    static String firstName;
    static String lastName;
    static long contact;
    static String email;
    static String password;

    public static boolean registerUser(String fName, String lName, long ph, String mail, String pswd) {
        boolean isUserRegistered = false;
        boolean firstValid = false;
        boolean lastValid = false;
        boolean contactValid = false;
        boolean emailValid = false;
        boolean passValid = false;

        if (fName != null) {
            firstName = fName;
            firstValid = true;
        }

        if (lName != null) {
            lastName = lName;
            lastValid = true;
        }

        if (ph != 0 && mail != null) {
            contact = ph;
            email = mail;
            contactValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passValid = true;
        }

        if (firstValid && lastValid && contactValid && emailValid && passValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Contact & Email: " + contact + ", " + email);
        System.out.println("Password: " + password);
    }
}
