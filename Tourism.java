class Tourism {
    static String touristPlaces[] = {
        "Hampi,", "Belur,", "Shravanabelagola,", "Aihole,", "Badami,", 
        "Bijapur Gol Gumbaz,", "Halebidu,", "Gokarna,", "Nagarhole,", "BR Hills"
    };

    public static void main(String[] Tourism) {
        System.out.println("Top 10 Tourist Places in Karnataka: " + touristPlaces.length);
        System.out.println(touristPlaces[0] + " " + touristPlaces[1] + " " + touristPlaces[2] + " " + touristPlaces[3] + " " + touristPlaces[4] + " " +
                           touristPlaces[5] + " " + touristPlaces[6] + " " + touristPlaces[7] + " " + touristPlaces[8] + " " + touristPlaces[9]);
    }
}
