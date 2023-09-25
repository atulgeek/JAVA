import java.util.Scanner;
public class Trails {
    public static int oddevencal(int x, int y, int z) {
        return (x+y+z)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x=sc.nextInt();
        System.out.print("Enter the Number : ");
        int y=sc.nextInt();
        System.out.print("Enter the Number : ");
        int z=sc.nextInt();
        
        
        System.out.println(oddevencal(x, y, z));
    }
}