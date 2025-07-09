class AirConditioner {
    static boolean isOn;
    static int currentTemperature;
    static int maxTemperature = 30;

    public static void onOrOff() {
        if (isOn == false) {
            isOn = true;
            System.out.println("The Air Conditioner is turned on " + isOn);
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The Air Conditioner is turned off " + isOn);
        }
    }

    public static void increaseTemperature() {
        System.out.println("increaseTemperature started");
        if (isOn == true) {
            if (currentTemperature <= maxTemperature) {
                currentTemperature = currentTemperature + 1;
                System.out.println("The Air Conditioner temperature is " + currentTemperature);
            } else {
                System.out.println("Air Conditioner already at Max Temperature");
            }
        }
    }

    public static void decreaseTemperature() {
        System.out.println("decreaseTemperature started");
        if (isOn == true) {
            if (currentTemperature >= 0) {
                currentTemperature = currentTemperature - 1;
                System.out.println("The Air Conditioner temperature is " + currentTemperature);
            }
            System.out.println("Min Temperature reached");
        }
    }
}
