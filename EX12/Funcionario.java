package EX12;

/*
12. Crie uma classe Funcionário que obedeça à descrição abaixo:
Funcionario
+ nome: String
+ sobrenome: String
+ horasTrabalhadas: int
+ valorPorHora: float
+ nomeCompleto(): string
+ calcularSalario(): void
+ incrementarHoras(int): void• O método nomeCompleto deve retornar o 
atributo nome concatenado ao atributo
sobrenome
• O método calcularSalario faz o cálculo de quanto o funcionário irá receber no mês,
multiplicando o atributo horasTrabalhadas pelo atributo valorPorHora. Em seguida,
escreve o valor no ecrã.
• O método incrementarHoras adiciona um valor passado por parâmetro ao valor já
existente no atributo valorPorHora.
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
public class Funcionario {
    
    /*
    + nome: String
+ sobrenome: String
+ horasTrabalhadas: int
+ valorPorHora: float
+ nomeCompleto(): string
+ calcularSalario(): void
+ incrementarHoras(int): void• O método nomeCompleto deve retornar o atributo nome concatenado ao atributo
sobrenome
    */
   public String nome; 
   public String sobrenome;
   public int horasTrabalhadas;
   public float valorPorHora;
   
   public Funcionario( String nome, String sobrenome, int horasTrabalhadas, float valorPorHora){
    this.nome = nome;
     this.sobrenome = sobrenome;
     this.horasTrabalhadas = horasTrabalhadas;
     this.valorPorHora = valorPorHora; 
   }

/*
+ calcularSalario(): void
+ incrementarHoras(int): void• O método nomeCompleto deve retornar o 
atributo nome concatenado ao atributo
sobrenome
    */
   public String nomeCompleto(){
    return this.nome + " " + this.sobrenome;
   }

   public void calcularSalario(){
    float salario = this.horasTrabalhadas * this.valorPorHora;
    System.out.println("Salário: " + salario);
   }

   public void incrementarHoras(int horas){
    this.horasTrabalhadas += horas;
   }

}
