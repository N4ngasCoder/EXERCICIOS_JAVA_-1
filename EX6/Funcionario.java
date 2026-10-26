/*
 Implemente uma classe para definir os
  objectos que representarão os funcionários de uma empresa.
   Essa classe deve declarar três atributos: um para os 
   nomes, outro para os salários e um terceiro para os 
   códigos dos funcionários. No final efectue um teste 
   criando dois objectos da classe funcionário e imprima 
   seus dados.
 */
public class Funcionario {
    private String nome;
    private double salario;
    private int codigo;

    public Funcionario(String nome, double salario, int codigo) {
        this.nome = nome;
        this.salario = salario;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}