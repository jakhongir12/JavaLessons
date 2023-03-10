public class hello {
    public static void main(String[] args) {
        // generate a random number between 1 and 100
        int random = (int)(Math.random() * 100 + 1);
        System.out.println("Generated random number: " + random);

        // check even or odd
        if (random % 2 == 0) {
            System.out.println(random + " is even.");
        } else {
            System.out.println(random + " is odd.");
        }
    }
}

