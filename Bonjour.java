import java.util.Scanner;

public class Bonjour {
    public static void main(String[] args) {
        System.out.println("Press Button Between 1,2,3");
        Scanner sc=new Scanner (System.in);
        int Button = sc.nextInt();
        if (Button == 1) {
            System.out.println("Namaste");
        }else {
            if (Button == 2){
            System.out.println("Hello");
        } else {
            if (Button == 3){
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }
        }
    }
}
}
