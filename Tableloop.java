import java.util.Scanner;
public class Tableloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " " + " = " + i * n);
        }
    }
}