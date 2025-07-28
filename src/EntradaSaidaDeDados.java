import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idade = scanner.nextInt();
        System.out.println("Seu nome é " + nome + " " + sobrenome + " e você tem " + idade + " anos.");


    }
}
