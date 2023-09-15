import java.util.Scanner;

public class NaturalNumberAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int i;
        int sum = 0;
        for (i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
