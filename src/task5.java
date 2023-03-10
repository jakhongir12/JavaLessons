import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 100, max = 1, i = 0;

        while (i < 10) {
            int num = random.nextInt(100) + 1;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            i++;
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}

