import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário 1: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite o salário do funcionário 1: ");
        double salario1 = scanner.nextDouble();
        System.out.print("Digite o código do funcionário 1: ");
        int codigo1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Funcionario funcionario1 = new Funcionario(nome1, salario1, codigo1);

        System.out.print("Digite o nome do funcionário 2: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite o salário do funcionário 2: ");
        double salario2 = scanner.nextDouble();
        System.out.print("Digite o código do funcionário 2: ");
        int codigo2 = scanner.nextInt();

        Funcionario funcionario2 = new Funcionario(nome2, salario2, codigo2);

        System.out.println("\nDados do Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Código: " + funcionario1.getCodigo());

        System.out.println("\nDados do Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Código: " + funcionario2.getCodigo());

        scanner.close();
    }
}