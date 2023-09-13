import java.util.Scanner;

public class BonjourSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch (Button) {
    case 1: System.out.println("Hello");
    break;
    case 2: System.out.println("Bonjour");
    break;
    case 3:System.out.println("Namaste");
    break;
    default: System.out.println("Invalid Button");
        }
    }
}
