 /*
 
 Crie uma classe que modele um funcionário
•Um empregado tem um nome e um salário
•Escreva um constructor com dois parâmetros (nome e salário)
•Métodos para devolver nome, salário, aumentar salário (percentual de
aumento) que aumente o salário do funcionário em uma certa
percentagem.
•
Escreva um pequeno programa que teste a sua classe.
 */

/**
 * funcionario
 */
public class Funcionario {

     private String nome; 
     private double salario; 

      public Funcionario(String nome, double salario){
         this.nome = nome; 
         this.salario = salario; 
      }

      public  String getNome(){
        return nome; 
      }

      public double getSalario(){
        return salario; 
      }

      public double aumentoSalarial(int percentagem){
        salario = salario + (salario * percentagem/ 100 ); 

        return salario; 
      }
}
