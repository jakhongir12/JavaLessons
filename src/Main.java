public class Main {
    private static final String NAME = "Jakhongir";

    private static float earthWeightSurname = 80;

    private static float marsGravity = 0.38f;
    public static void main(String[] args) {
        float marsWeightSurname = earthWeightSurname * marsGravity;
        System.out.println( earthWeightSurname + " kg on Earth is " + marsWeightSurname + " kg on Mars");

        double marsWeightDouble = marsWeightSurname;
        System.out.println("Kilograms om Mars after converting to double: " +  marsWeightDouble);

        System.out.printf("kg on Mars displayed to flout decimal places:%.4f %n", marsWeightDouble);

        int marsWeightInt = (int) marsWeightDouble;
        System.out.println("Kilograms on Mars when casted to integer: " + marsWeightInt);

        char marsWeightChar = (char) marsWeightInt;
        System.out.println("The ASCII table equivalent of mars Weight    " + marsWeightChar);

        int result = marsWeightChar + 10;
        System.out.println("An example of a math operation on the char type: " + result);


    }
}