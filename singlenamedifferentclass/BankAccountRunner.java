class BankAccountRunner{
    static double balance;
	public static void main(String accounts[]){
		System.out.println("main started");
		
		//methodName
		BankAccount.credit(0.00);
		System.out.println("The current balance is "+ BankAccount.balance);
		BankAccount.debit(300.00);
		System.out.println("The current balance is "+ BankAccount.balance);
		System.out.println("main ended");
		
		
		
	}
}
	
	//debit
	//credit
	//transfer

	
	    //DataType variableName-parameter
		//<access-specifier>returnType methodName(parameter)
	   /* public static void debit (double amount){
			System.out.println("debit started");
		        balance = balance-amount;
				System.out.pritln("debit ended");
		
		}
		
		public static void credit (double amount){
			System.out.println("credit started");
		          balance = balance+amount;
				  System.out.pritln("credit ended");
		
		
		
		
		}*/
		
		
		
		







