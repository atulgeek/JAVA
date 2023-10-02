import java.util.Scanner;
public class FuncPower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : ");
        int x = sc.nextInt();
        System.out.println("Enter Power Value : ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
        result = result * x;
        }
        System.out.println("Raised to the power Number "+ result);
    }
}