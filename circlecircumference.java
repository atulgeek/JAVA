import java.util.Scanner;
public class circlecircumference {
    public static double circumference(double r) {
        double cir = 2* 3.14 * r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle : ");
        double r = sc.nextInt();
        System.out.println("circumference of a circle is "+ circumference(r) );
    }
}