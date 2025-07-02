/*class SpiceShop {
    static String spices[] = {
        "Turmeric,", "Coriander,", "Cumin,", "Chili Powder,", "Garam Masala,", 
        "Mustard Seeds,", "Cloves,", "Cinnamon,", "Fennel Seeds,", "Asafoetida,", 
        "Fenugreek,", "Black Pepper,", "Bay Leaf,", "Carom Seeds"
    };

    public static void main(String[] SpiceShop) {
        System.out.println("Top 14 Spices Available in the Spice Shop: " + spices.length);
        System.out.println(spices[0] + " " + spices[1] + " " + spices[2] + " " + spices[3] + " " + spices[4] + " " +
                           spices[5] + " " + spices[6] + " " + spices[7] + " " + spices[8] + " " + spices[9] + " " +
                           spices[10] + " " + spices[11] + " " + spices[12] + " " + spices[13]);
    }
}*/

class SpiceShop {
	public static void main(String[] args) {
		String item0 = "Turmeric,";
		String item1 = "Coriander,";
		String item2 = "Cumin,";
		String item3 = "Chili Powder,";
		String item4 = "Garam Masala,";
		String item5 = "Mustard Seeds,";
		String item6 = "Cloves,";
		String item7 = "Cinnamon,";
		String item8 = "Fennel Seeds,";
		String item9 = "Asafoetida,";
		String item10 = "Fenugreek,";
		String item11 = "Black Pepper,";
		String item12 = "Bay Leaf,";
		String item13 = "Carom Seeds";

		String[] spiceItems = {
			item0, item1, item2, item3, item4, item5, item6,
			item7, item8, item9, item10, item11, item12, item13
		};

		for (String item : spiceItems) {
			System.out.println(item);
		}
	}
}
