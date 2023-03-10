import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid input: a cannot be zero.");
            return;
        }

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        switch ((int) Math.signum(delta)) {
            case -1:
                System.out.println("There are no real roots.");
                break;
            case 0:
                double x0 = -b / (2 * a);
                System.out.printf("There is one root: x = %.2f\n", x0);
                break;
            case 1:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("There are two roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
        }
    }
}
