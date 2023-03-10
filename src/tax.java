public class tax {

    public static void main(String[] args){
        double netPrice = 9.99;
        double grossPrice = netPrice * 1.23;
        double totalGrossPrice = grossPrice * 10000;
        double totalNetPrice = totalGrossPrice / 1.23;

        System.out.println("Net price: " + netPrice);
        System.out.println("Gross price: " + grossPrice);
        System.out.println("Total gross price: " + totalGrossPrice);
        System.out.println("Total net price: " + totalNetPrice);

    }
}
