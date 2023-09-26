import java.util.*;
public class FuncOddno {
    public static void FuncOddnumber(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum Of All Odd Number : " + sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of X : ");
        int x = sc.nextInt();
        FuncOddnumber(x);
    }
}