import java.util.Scanner;
public class FunOddEven {
    public static void oddevencal(int x) {
        if (x % 2 == 0){
            System.out.println("You have Entered "+x+" and " +x+ " is Even Number ");
        }else {
            System.out.println( "You have Entered "+x+" and " +x+ " is Odd Number ");
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x=sc.nextInt();
        oddevencal(x);
    }
}