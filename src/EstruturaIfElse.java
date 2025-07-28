import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        System.out.println("Ta chovendo? (true ou false)");
        boolean chovendo = scanner.nextBoolean();

        if (!chovendo){
            System.out.println("Vamos sair de casa.");
        } else {
            System.out.println("Melhor ficar em casa.");
        }

        System.out.println("Tem emprego? (true ou false)");
        boolean temEmprego = scanner.nextBoolean();
        System.out.println("Tem reserva de emergência? (true ou false)");
        boolean temReserva = scanner.nextBoolean();

        if (temEmprego && temReserva) {
            System.out.println("Acumule BTC");
        } else if (temEmprego && !temReserva) {
            System.out.println("Junte uma Reserva de Emergência");
        } else {
            System.out.println("Vá entregar currículo.");
        }
    }
}
