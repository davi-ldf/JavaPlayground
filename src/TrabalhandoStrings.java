public class TrabalhandoStrings {
    public static void main(String[] args) {
        String nome = "Davi";
        String nome2 = "davi";

        nome = nome.toLowerCase();
        nome2 = nome2.toLowerCase();

        String sobrenome = " Lisboa de França";

        if (nome.equals(nome2)) {
            System.out.println("Os nomes são iguais");
        } else {
            System.out.println("Os nomes são diferentes");
        }

        System.out.println("Olá, " + nome + "!");
        System.out.println("Seu nome tem " + nome.length() + " caracteres.");
        System.out.println("Seu nome completo é " + nome.concat(sobrenome));
    }
}
