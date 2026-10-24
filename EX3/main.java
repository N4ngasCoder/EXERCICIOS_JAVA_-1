import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     Funcionario funcionario = new Funcionario("joao", 1000);
     System.out.println("nome: " + funcionario.getNome()); 
     System.out.println("salario: " + funcionario.getSalario());

	}
}
