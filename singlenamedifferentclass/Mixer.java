class Mixer{
	static boolean isOn;
	static int currentSpeed;
	static int maxSpeed = 5;
	
	public static void onOrOff(){
		if(isOn == false){
			isOn = true;
			System.out.println("The mixer is turned on "+ isOn);
			
			}
			else if (isOn == true)
			{
				isOn = false;
				System.out.println("The mixer is turned off "+ isOn);
			}
		}
		public static void increaseSpeed(){
			System.out.println("increaseSpeed started");
			if(isOn == true){
			if (currentSpeed <= maxSpeed){
				currentSpeed = currentSpeed +1;
				System.out.println("The mixer speed is " + currentSpeed);
			}else{
				System.out.println("Mixer already at Max Speed");		
			}
			   }
		     	}
				public static void decreaseSpeed(){
				 System.out.println("decreaseSpeed started");
				 if(isOn == true){
					 if(currentSpeed >= 0){
						 currentSpeed = currentSpeed - 1;
						 System.out.println("The mixer speed is "+ currentSpeed);
					 }
					 System.out.println("min Speed reached");
				 }
				 
					
				}
	
	
	
	
}