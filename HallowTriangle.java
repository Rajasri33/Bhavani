public class HallowTriangle {
    public static void main(String[] args) {
        int height = 5; // You can change the height of the triangle here

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                // Print stars for the borders and top of the triangle
                if (j == 0 || j == i || i == height - 1) {
                    System.out.print("* ");
                } else {
                    // Print spaces inside the triangle
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
