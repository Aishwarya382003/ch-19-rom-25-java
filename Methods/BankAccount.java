class BankAccount {
    // Static variable so it can be accessed by static methods
    static double balance = 1000.0; // initialized with some amount

    public static void main(String[] Account) {
        System.out.println("main Started");

        // methodName()
        debit(200.0);   // Calling debit method
        credit(150.0);  // Calling credit method

        System.out.println("Final Balance: " + balance);
        System.out.println("main ended");
    }

    // Datatype variableName - parameter
    //<access-specifier>, returnType, methodName (parameters)
    public static void debit(double amount) {
        System.out.println("debit Started");
        balance = balance - amount;
        System.out.println("debit ended");
    }

    public static void credit(double amount) {
        System.out.println("credit Started");
        balance = balance + amount;
        System.out.println("credit ended");
    }
}
