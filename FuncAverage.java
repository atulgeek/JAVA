import java.util.Scanner;
public class FuncAverage {
    public static float FuncAver(float a, float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        float b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        float c = sc.nextInt();
        System.out.println("The Average of these three Number is "+FuncAver(a,b,c));
    }
}