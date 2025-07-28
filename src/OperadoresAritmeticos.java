public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double bread = 1.50;
        double cheese = 25.00;
        double sugar = 3.50;


        double totalValue = bread + cheese + sugar;
        double discount = totalValue / 10;
        double totalValueOfferPrice = totalValue - discount;

        System.out.println("Valor Original: R$" + totalValue);
        System.out.println("Valor Total: R$" + totalValueOfferPrice);
    }
}
