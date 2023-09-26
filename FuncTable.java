import java.util.Scanner;
public class FuncTable {
    public static void FunTable(int n) {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(n + " * " + i + " " + " = " + i * n);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        FunTable(n);
    }
}