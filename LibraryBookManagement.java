import java.util.Scanner;

public class LibraryBookManagement {
    void displayBookInfo(String title, String author, String id, boolean isAvailable) {
        System.out.println("===== BOOK INFO =====");
        System.out.println("Title: " + title.toUpperCase());
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + id.toUpperCase());
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Author Name Length: " + author.length());
        compareAuthorNames(author, "Shakespeare");
    }
    double calculateAverageRating(int[] ratings) {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }
    int calculateTotalRatings(int[] ratings) {
        return ratings.length;
    }
        static void compareAuthorNames(String a1, String a2) {
        if (a1.equalsIgnoreCase(a2)) {
            System.out.println("Comparing with '" + a2 + "' → Same author");
        } else {
            System.out.println("Comparing with '" + a2 + "' → Different authors");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryBookManagement lib = new LibraryBookManagement();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();

        System.out.print("Is book available? (true/false): ");
        boolean isAvailable = sc.nextBoolean();
        
        System.out.print("Enter number of ratings: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("No ratings available!");
            return; 
        }

        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter rating " + (i + 1) + ": ");
            ratings[i] = sc.nextInt();
        }

        lib.displayBookInfo(title, author, id, isAvailable);
        System.out.println("\n===== RATINGS =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Rating " + (i + 1) + " → " + ratings[i]);
            if (ratings[i] == 1) {
                System.out.println("One user gave a poor rating!");
            }
        }

        int total = lib.calculateTotalRatings(ratings);
        double average = lib.calculateAverageRating(ratings);

        System.out.println("\nTotal Ratings: " + total);
        System.out.println("Average Rating: " + average);

        if (average >= 4) {
            System.out.println("Book Status: Highly Rated Book!");
        } else {
            System.out.println("Book Status: Average Book");
        }
    }
}
