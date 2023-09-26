import java.util.Scanner;
public class FuncGreaterLower {
    public static void greaterlower(int a, int b) {
        if (a < b) {
            System.out.println("The first number is smaller");
        } else if (a > b) {
            System.out.println("The second number is smaller");
        } else {
            System.out.println("Both are Equal");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        greaterlower(a, b);
    }
}