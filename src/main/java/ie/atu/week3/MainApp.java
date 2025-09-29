package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        System.out.println("Simple Calculator");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter Operator (1/Addition . 2/Subtract . 3/Multiply . 4/Divide): ");
        int math = sc.nextInt();

        int result = 0;

        switch (math) {
            case 1:
                result = calc.add(a, b);
                break;
            case 2:
                result = calc.sub(a, b);
                break;
            case 3:
                result = calc.mul(a, b);
                break;
            case 4:
                if(b == 0)
                {
                    System.out.println("Division by zero error");
                    break;
                }
                result = calc.div(a, b);
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}