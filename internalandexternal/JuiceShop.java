/*class JuiceShop {
    static String juice0 = "Orange";
    static String juice1 = "Apple";
    static String juice2 = "Grape";
    static String juice3 = "Pineapple";
    static String juice4 = "Watermelon";

    static String[] juices = {
        juice0, juice1, juice2, juice3, juice4
    };

    public static void main(String[] args) {
        for (String juice : juices) {
            System.out.println(juice);
        }
    }
}*/

class JuiceShop {
    public static void main(String[] args) {
        String juice0 = "Orange";
        String juice1 = "Apple";
        String juice2 = "Grape";
        String juice3 = "Pineapple";
        String juice4 = "Watermelon";

        String[] juicesItems = {
            juice0, juice1, juice2, juice3, juice4
        };

        for (String item : juicesItems) {
            System.out.println(item);
        }
    }
}
