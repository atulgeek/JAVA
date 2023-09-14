import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println(" \n Choose Operators According To Your Requirements \n\n Press 1 for Addition \n Press 2 For Subtraction \n Press 3 for Multiplication \n Press 4 for Division \n Press 5 For Modulo");
        int Operator = sc.nextInt();
        if (Operator == 1){
            System.out.println("Addition of : "+a+"+"+b+"="+(a+b));
                }else if (Operator == 2){
                    System.out.println("Subtraction of : "+a+"-"+b+"="+(a-b));
                        } else if (Operator == 3){
                            System.out.println("Multiplecation of : " +a+"*"+b+"="+(a*b));
                                                    }else if (Operator == 4){
                                                        System.out.println("Division of : "+a+"/"+b+"="+(a/b));
                                                            }else if (Operator ==5){
                                                                System.out.println("Reminder of : "+a+"%"+b+"="+(a%b));
                                                            }else {
                                                System.out.println("You Are Using Wrong Operator's ");
                                            }
                                        }
                                    }