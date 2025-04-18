import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    // Constructor
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); // Convert to lowercase to avoid case mismatch
    }

    // Method to perform the calculation
    void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation. Please use add, subtract, multiply, or divide.");
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        // Create Calculator object and perform operation
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();
    }
}
