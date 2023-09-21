public class Trails {
    public static void main(String[] args) {
        int n = 7;
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                // spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // outer loop
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                // spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}