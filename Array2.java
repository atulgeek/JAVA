import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the Number which You want  to search :");
        int x = sc.nextInt();
        for (int i = 0; i <number.length; i++) {
            if (number[i] == x) {
                System.out.println("X Found at index :" +i);
            }
        }
    }
}