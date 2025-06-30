class Supermarket {
    static String items[] = {
        "Toor Dal,", "Cornflakes,", "Toothbrush,", "Handwash,", "Shaving Cream,", 
        "Salt,", "Black Pepper,", "Green Tea,", "Detergent Powder,", "Peanut Butter"
    };

    public static void main(String[] Items) {
        System.out.println("Top 10 Items in the Supermarket: " + items.length);
        System.out.println(items[0] + " " + items[1] + " " + items[2] + " " + items[3] + " " + items[4] + " " +
                           items[5] + " " + items[6] + " " + items[7] + " " + items[8] + " " + items[9]);
    }
}
