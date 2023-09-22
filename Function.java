import java.util.Scanner;
public class Function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.next(); // Without sc.nextline() It will print only single Line
        printMyName(name);
    }
}