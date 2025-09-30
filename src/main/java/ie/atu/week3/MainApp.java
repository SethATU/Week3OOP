package ie.atu.week3;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        System.out.println("Simple Calculator");

        //asks user for first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        //asks user for second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //asks user what they want to do with the numbers
        System.out.print("Enter Operator (1/Addition . 2/Subtract . 3/Multiply . 4/Divide . 5/Power . 6/Modulo): ");
        int math = sc.nextInt();

        //switch to perform the desired output for the user
        double result = switch (math) {
            case 1 -> {
                yield calc.add(a, b);
            }
            case 2 -> {
                yield calc.sub(a, b);
            }
            case 3 -> {
                yield calc.mul(a, b);
            }
            case 4 -> {
                if(b == 0) //if the user input int b as 0 to divide by int a, error message will pop up and result will be 0
                {
                    System.out.println("Division by zero error");
                    yield 0;
                }
                else
                {
                    yield calc.div(a, b);
                }
            }
            case 5 -> {
                yield calc.power(a, b);
            }
            case 6 -> {
                yield calc.modulo(a, b);
            }
            default -> {  //if the user input a character that is not listed in the printf statements above, user will receive error message and result will be 0
                System.out.println("Invalid input");
                yield 0;
            }
        };

        //print out the result of the 2 numbers
        System.out.println("Result: " + result);
        sc.close();
    }
}