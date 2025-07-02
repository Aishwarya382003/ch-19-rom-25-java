/*class EarthContinents {
    static String cont0 = "Asia";
    static String cont1 = "Africa";
    static String cont2 = "North America";
    static String cont3 = "South America";
    static String cont4 = "Antarctica";
    static String cont5 = "Europe";
    static String cont6 = "Australia";

    static String[] continents = {
        cont0, cont1, cont2, cont3, cont4, cont5, cont6
    };

    public static void main(String[] args) {
        for (String cont : continents) {
            System.out.println(cont);
        }
    }
}*/

class EarthContinents {
    public static void main(String[] args) {
        String cont0 = "Asia";
        String cont1 = "Africa";
        String cont2 = "North America";
        String cont3 = "South America";
        String cont4 = "Antarctica";
        String cont5 = "Europe";
        String cont6 = "Australia";

        String[] continentsItems = {
            cont0, cont1, cont2, cont3, cont4, cont5, cont6
        };

        for (String item : continentsItems) {
            System.out.println(item);
        }
    }
}
