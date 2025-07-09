class WashingMachine {
    static boolean isOn;
    static int currentWashCycle;
    static int maxCycle = 5;
	static int minCycle = 1;

    public static void onOrOff() {
        if (isOn == false) {
            isOn = true;
            System.out.println("The washing machine is turned on " + isOn);
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The washing machine is turned off " + isOn);
        }
    }

    public static void increaseCycle() {
        System.out.println("increaseCycle started");
        if (isOn == true) {
            if (currentWashCycle <= maxCycle) {
                currentWashCycle = currentWashCycle + 1;
                System.out.println("The washing machine cycle is " + currentWashCycle);
            } else {
                System.out.println("Washing machine already at Max Cycle");
            }
        }
    }

    public static void decreaseCycle() {
        System.out.println("decreaseCycle started");
        if (isOn == true) {
            if (currentWashCycle >= 0) {
                currentWashCycle = currentWashCycle - 1;
                System.out.println("The washing machine cycle is " + currentWashCycle);
            }
            System.out.println("Min Cycle reached");
        }
    }
}
