import java.util.Scanner;
import java.lang.Math;
public class FuncPower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : ");
        int x = sc.nextInt();
        System.out.println("Enter Power Value : ");
        int n = sc.nextInt();
        double power = Math.pow(x,n);
        System.out.println("Raised to the power Number "+ power);
    }
}