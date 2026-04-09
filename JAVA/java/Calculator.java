import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Which operation - (+, -, *, /)");
        String ch = sc.next();
        switch(ch){
            case "+":
                System.out.println("Addition is: " + (a+b));
                break;

            case "-":
                System.out.println("Subtraction is: " + (a-b));
                break;

            case "*":
                System.out.println("Multiplication is: " + (a*b));
                break;

            case "/":
                System.out.println("Division is: " + (a/b));
                break;

            default:
                System.out.println("Incorrect choice.");
        }
    }
}