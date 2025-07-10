class Pinterest {

    static String name;
    static String username;
    static long phone;
    static String email;
    static String password;

    public static boolean registerUser(String nameInput, String userInput, long ph, String em, String pswd) {
        boolean isUserRegistered = false;
        boolean nameValid = false;
        boolean usernameValid = false;
        boolean phoneValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (nameInput != null) {
            name = nameInput;
            nameValid = true;
        }

        if (userInput != null) {
            username = userInput;
            usernameValid = true;
        }

        if (ph != 0 && em != null) {
            phone = ph;
            email = em;
            phoneValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (nameValid && usernameValid && phoneValid && emailValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Phone and Email: " + phone + ", " + email);
        System.out.println("Password: " + password);
    }
}
