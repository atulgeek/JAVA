import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number ");
        int n= sc.nextInt();
        for (i = 0; i <= n; i++) {
            sum = i+ i;
            System.out.println(i);   
        }
        System.out.println(sum);
    }
}