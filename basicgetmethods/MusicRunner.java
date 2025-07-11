class MusicRunner {
    public static void main(String[] Music) {
        System.out.println("First Name: " + MusicAppUser.getFirstName());
        System.out.println("Last Name: " + MusicAppUser.getLastName());
        System.out.println("Full Name: " + MusicAppUser.getFullName());
        System.out.println("Age: " + MusicAppUser.getAge());
        System.out.println("Favorite Genre: " + MusicAppUser.getFavoriteGenre());
        System.out.println("Playlists Created: " + MusicAppUser.getPlaylistsCreated());
        System.out.println("Listening Hours: " + MusicAppUser.getListeningHours());
        System.out.println("Premium User: " + MusicAppUser.isPremiumUser());
        System.out.println("Gender: " + MusicAppUser.getGender());
        System.out.println("Email: " + MusicAppUser.getEmail());
        System.out.println("Uses Offline Mode: " + MusicAppUser.usesOfflineMode());
    }
}
