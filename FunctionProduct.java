import java.util.Scanner;
public class FunctionProduct {
    public static int CalculateProduct(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Value : ");
        int b = sc.nextInt();
        System.out.println("Product of 2 Number "+ CalculateProduct(a, b));
    }
}