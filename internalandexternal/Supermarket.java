/*class Supermarket {
    static String product0 = "Milk";
    static String product1 = "Bread";
    static String product2 = "Butter";
    static String product3 = "Cheese";
    static String product4 = "Eggs";
    static String product5 = "Fruits";
    static String product6 = "Vegetables";
    static String product7 = "Biscuits";

    static String[] products = {
        product0, product1, product2, product3, product4, product5, product6, product7
    };

    public static void main(String[] args) {
        for (String product : products) {
            System.out.println(product);
        }
    }
}*/

class Supermarket {
	public static void main(String[] args) {
		String item0 = "Milk";
		String item1 = "Bread";
		String item2 = "Butter";
		String item3 = "Cheese";
		String item4 = "Eggs";
		String item5 = "Fruits";
		String item6 = "Vegetables";
		String item7 = "Biscuits";

		String[] productItems = {
			item0, item1, item2, item3, item4, item5, item6, item7
		};

		for (String item : productItems) {
			System.out.println(item);
		}
	}
}
