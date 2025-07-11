
class RecipeRunner {
    public static void main(String[] Recipe) {
        System.out.println("First Name: " + RecipeAppUser.getFirstName());
        System.out.println("Last Name: " + RecipeAppUser.getLastName());
        System.out.println("Full Name: " + RecipeAppUser.getFullName());
        System.out.println("Age: " + RecipeAppUser.getAge());
        System.out.println("Favorite Cuisine: " + RecipeAppUser.getFavoriteCuisine());
        System.out.println("Recipes Saved: " + RecipeAppUser.getRecipesSaved());
        System.out.println("Pro User: " + RecipeAppUser.isProUser());
        System.out.println("Daily Cooking Hours: " + RecipeAppUser.getDailyCookingHours());
        System.out.println("Gender: " + RecipeAppUser.getGender());
        System.out.println("Email: " + RecipeAppUser.getEmail());
        System.out.println("Grocery List Enabled: " + RecipeAppUser.hasGroceryList());
    }
}