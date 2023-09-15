import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.print("You are eligible to vote");
        } else {
            System.out.print("Sorry, you cannot vote yet.");
        }
    }
}
