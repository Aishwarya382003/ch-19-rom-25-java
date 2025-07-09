class Speaker {

    boolean isConnected = false;
    static int currentVolume = 0;
    int maxVolume = 7;
    int minVolume = 0;

    // onOrOff
    public void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("The Speaker is turned ON");
        } else {
            isConnected = false;
            System.out.println("The Speaker is turned OFF");
        }
    }

    // increaseVolume
    public void increaseVolume() {
        System.out.println("increaseVolume started");
        if (isConnected) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("The Current Volume is " + currentVolume);
            } else {
                System.out.println("Max Volume Reached");
            }
        } else {
            System.out.println("gubeee.... Speaker on madoo");
        }
    }

    // decreaseVolume
    public void decreaseVolume() {
        System.out.println("decreaseVolume started");
        if (isConnected) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("The Current Volume is " + currentVolume);
            } else {
                System.out.println("Min Volume Reached");
            }
        } else {
            System.out.println("gubeee.... Speaker on madoo");
        }
    }
}

	

	


