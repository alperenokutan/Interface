import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Please enter the second number: ");
            double secondNumber = scanner.nextDouble();

            CalculatorOperation operation;

            Menu.selectActionMenu();

            int choice = scanner.nextInt();

            double result = 0.0;

            switch (choice) {
                case 1:
                    operation = new additionOperation();
                    break;
                case 2:
                    operation = new subtractionOperation();
                    break;
                case 3:
                    operation = new multiplicationOperation();
                    break;
                case 4:
                    operation = new divisionOperation();
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    continue;
            }

            result = operation.Operation(firstNumber, secondNumber);

            System.out.println("Result: " + result);

            Menu.continueMenu();

            int choiceForContinue = scanner.nextInt();
            if (choiceForContinue != 1) {
                System.out.println("Calculator closing...");
                break;
            }
        }
    }
}