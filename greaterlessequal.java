import java.util.Scanner;

public class greaterlessequal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Value of A ");
        int a = sc.nextInt();
        System.out.println("Enter Value of B ");
        int b  = sc.nextInt();
        if (a > b) {
            System.out.println("A is Greater Then B");
        }else {
            if (a < b){
            System.out.println(" B is Greater Then A");
        } else {
            System.out.println("Both are Equal");
        }
    }
}
}
