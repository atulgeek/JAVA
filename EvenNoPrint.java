import java.util.Scanner;

public class EvenNoPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number of X :  ");
        int x = sc.nextInt();
        int i;
        for(i=1; i<=x; i++)
        if (i%2==0){
            System.out.println(i);
        }
    }
}
