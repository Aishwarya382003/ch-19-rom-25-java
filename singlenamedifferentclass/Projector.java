class Projector {
    static boolean isOn;
    static int currentBrightness;
    static int maxBrightness = 10;
	static int minBrightness = 1;

    public static void onOrOff() {
        if (isOn == false) {
            isOn = true;
            System.out.println("The projector is turned on " + isOn);
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The projector is turned off " + isOn);
        }
    }

    public static void increaseBrightness() {
        System.out.println("increaseBrightness started");
        if (isOn == true) {
            if (currentBrightness <= maxBrightness) {
                currentBrightness = currentBrightness + 1;
                System.out.println("The projector brightness is " + currentBrightness);
            } else {
                System.out.println("Projector already at Max Brightness");
            }
        }
    }

    public static void decreaseBrightness() {
        System.out.println("decreaseBrightness started");
        if (isOn == true) {
            if (currentBrightness >= 0) {
                currentBrightness = currentBrightness - 1;
                System.out.println("The projector brightness is " + currentBrightness);
            }
            System.out.println("Min Brightness reached");
        }
    }
}
