public class ConversaoTipos {
    public static void main(String[] args) {
        //Int pra Double (implicita)
        int numero = 10;
        double d = numero;
        System.out.println(d);

        //Double pra Int (explícita)
        double d2 = 10.5;
        int numero2 = (int) d2;
        System.out.println(numero2);

        //Numero pra String
        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();
        System.out.println(numeroString + " " + numeroInteger);

        //String pra Numero
        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);
        System.out.println(numeroStringDois + " " + numeroConvertido);
    }
}
