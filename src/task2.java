import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumber = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumber = scanner.nextFloat();

        float sumResult = firstNumber + secondNumber;
        float differenceResult = firstNumber - secondNumber;
        float productResult = firstNumber * secondNumber;
        float quotientResult = firstNumber / secondNumber;

        System.out.printf("Sum: %.2f\n", sumResult);
        System.out.printf("Difference: %.2f\n", differenceResult);
        System.out.printf("Product: %.2f\n", productResult);
        System.out.printf("Quotient: %.2f\n", quotientResult);
    }
}
