public class patternsinverted {
    public static void main(String[] args) {
        // Define the number of rows for the triangle
        int rows = 5;

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing all stars in a row
            System.out.println();
        }
    }
}
