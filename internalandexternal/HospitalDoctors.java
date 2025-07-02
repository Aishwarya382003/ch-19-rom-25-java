/*class HospitalDoctors {
    static String doc0 = "Dr. Smith";
    static String doc1 = "Dr. Patel";
    static String doc2 = "Dr. Mehra";
    static String doc3 = "Dr. Reddy";
    static String doc4 = "Dr. Khan";

    static String[] doctors = {
        doc0, doc1, doc2, doc3, doc4
    };

    public static void main(String[] args) {
        for (String doc : doctors) {
            System.out.println(doc);
        }
    }
}*/

class HospitalDoctors {
    public static void main(String[] args) {
        String doc0 = "Dr. Smith";
        String doc1 = "Dr. Patel";
        String doc2 = "Dr. Mehra";
        String doc3 = "Dr. Reddy";
        String doc4 = "Dr. Khan";

        String[] doctorsItems = {
            doc0, doc1, doc2, doc3, doc4
        };

        for (String item : doctorsItems) {
            System.out.println(item);
        }
    }
}
