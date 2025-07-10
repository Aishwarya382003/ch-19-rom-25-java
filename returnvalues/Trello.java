class Trello {

    static String boardName;
    static String memberName;
    static long phone;
    static String email;
    static String password;

    public static boolean registerUser(String board, String member, long ph, String mail, String pswd) {
        boolean isUserRegistered = false;
        boolean boardValid = false;
        boolean memberValid = false;
        boolean phoneValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (board != null) {
            boardName = board;
            boardValid = true;
        }

        if (member != null) {
            memberName = member;
            memberValid = true;
        }

        if (ph != 0 && mail != null) {
            phone = ph;
            email = mail;
            phoneValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (boardValid && memberValid && phoneValid && emailValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Board Name: " + boardName);
        System.out.println("Member Name: " + memberName);
        System.out.println("Phone & Email: " + phone + ", " + email);
        System.out.println("Password: " + password);
    }
}
