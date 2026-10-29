package EX12;

/*

Crie o método main e instancie a classe Funcionário criada, criando um objeto
novoFuncionario do tipo Funcionario.
• Atribua o valor “Lionel” ao atributo nome
• Atribua o valor “Messi” ao atributo sobrenome
• Atribua o valor 10 ao atributo horasTrabalhadas
• Atribua o valor 25.50 ao atributo valorPorHora
• Chame o método nomeCompleto.
• Chame o método calcularSalario.
• Adicione 8 ao atributo horasTrabalhadas utilizando o método incrementarHoras
• Chame novamente o método calcularSalario.
*/
public class FuncionarioTeste {
    
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario("Lionel", "Messi", 10, 25.50f);

        
        String nomeCompleto = novoFuncionario.nome + " " + novoFuncionario.sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);

      
        float salario = novoFuncionario.horasTrabalhadas * novoFuncionario.valorPorHora;
        System.out.println("Salário: " + salario);

        novoFuncionario.horasTrabalhadas += 8;

       
        salario = novoFuncionario.horasTrabalhadas * novoFuncionario.valorPorHora;
        System.out.println("Salário após incremento de horas: " + salario);
    }
}
