import java.util.Scanner;

public class CondicionalTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tem dinheiro? (true ou false)");
        boolean temDinheiro = scanner.nextBoolean();

        // O if é um '?' e o else é um ':'
        String mensagem = (!temDinheiro) ? "Dorme." : "Pede ifood!";
        System.out.println(mensagem);

        // É basicamente o código abaixo refatorado
//        if (!temDinheiro){
//            System.out.println("Dorme.");
//        } else {
//            System.out.println("Pede ifood!");
//        }

    }
}
