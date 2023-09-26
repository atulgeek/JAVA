import java.util.Scanner;
public class FuncVoting {
    public static int Voting(int a) {
        if (a > 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("  Not Eligible to vote.");
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int a = sc.nextInt();
        Voting(a);
    }
}