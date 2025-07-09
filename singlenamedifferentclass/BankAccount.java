class BankAccount{
	static double balance;
	
	public static void credit(double amount){
		System.out.println("Credit Started");
		//boolean var = amount > 0.00;
		boolean creditCheck = amount > 0.00;
		if(creditCheck ){
		balance = balance + amount;
		}
		else{
			System.out.println("Amount should be greater than zero");
		}
		System.out.println("Credit Ended");
	}	
		
		public static void debit(double amount){
			System.out.println("Debit Started");
			boolean debitCheck = amount <=balance;
			if(debitCheck){
				balance = balance - amount;
				}
				else{
					System.out.println("Insufficient Fund");
					}
					System.out.println("Debit Ended");
				}
			}