import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Choose Operators According To Your Requirements \n" + 
                "\n" + 
                " Press 1 for Addition \n" + 
                " Press 2 For Subtraction \n" + 
                " Press 3 for Multiplication \n" +
                " Press 4 for Division \n" + 
                " Press 5 For Modulo");
        int Op = sc.nextInt();
        switch (Op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
        }
    }
}