import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual seu curso?: ");
        String Curso = scanner.nextLine();

        System.out.println("Qual sua idade?: " );
        int idade = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Qual seu email?: ");
        String email = scanner.nextLine();

        System.out.println("Qual seu cpf?: ");
        String cpf = scanner.nextLine();

        // Remover pontos e traço do CPF antes de converter para float
        cpf = cpf.replaceAll("[^0-9]", "");

        System.out.println("Qual sua altura?: ");
        float altura = scanner.nextFloat();

        System.out.println("Qual seu peso?: ");
        float peso = scanner.nextFloat();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Você esta cursando: " + Curso);
        System.out.println("Você tem: " + idade + " anos");
        System.out.println("Seu email é:" + email);
        System.out.println("Seu CPF É: " + cpf);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Você pesa: " + peso + " quilos");


    }
}