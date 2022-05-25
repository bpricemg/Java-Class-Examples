class MovieTest {
    public static void main(String[] args) {
        // Create some movie objects
        Movie shrek = new Movie(9, 8, 10);
        Movie shrek4 = new Movie(7, 6, 10);

        // Nate doesn't agree with the shrek ratings
        shrek.updateMusic(10);

        // Print the average rating
        System.out.println("Shrek has an average rating of " + shrek.overallRating());
        System.out.println("Shrek Forever After has an average rating of " + shrek4.overallRating());
    }
}