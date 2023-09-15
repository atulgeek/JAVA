import java.util.Scanner;

public class radiusofcircle {
    public static void main(String k[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of a Circle : ");
        Double r = sc.nextDouble();
        Double a;
        a = (22 * r * r) / 7;
        System.out.println("Area of Circle is = " + a);
    }

}
