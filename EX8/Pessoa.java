package EX8;

/*
8. Crie uma classe Pessoa que obedeça a descrição apresentada na representação
abaixo.
• Possua os atributos nome e idade. E os métodos: dizerONome, dizerAIdade e
fazerAniversario.

•O método dizerONome deve escrever na tela a mensagem: “Olá, meu nome
é”, e o valor do atributo nome.

•O método dizerAIdade deve escrever na tela a mensagem: “Olá, eu tenho X
anos”, onde X é o valor do atributo idade.

•O método fazerAniversario deve adicionar 1 à idade da Pessoa

•Crie também um método main que realize as seguintes operações:
o Instancie um objeto do tipo Pessoa.

o Atribua o seu nome ao atributo nome.
o Atribua a sua idade ao atributo idade.
o Chame o método dizerONome
o Chame o método dizerAIdade
o Chame o método fazerAniversario
o Chame o método dizerAIdade
*/
public class Pessoa {
    private String nome; 
    private int idade; 

public Pessoa(String nome, int idade){
    this.nome = nome; 
    this.idade = idade; 
}
 public  String getNome(){
    return nome; 
 }

 public int getIdade(){
    return idade; 
 }

 public void setNome(String nome){
    this.nome = nome; 
 }

 public void setIdade(int idade){
    this.idade = idade; 
 }

 /*
 •O método dizerONome deve escrever na tela a mensagem: “Olá, meu nome
é”, e o valor do atributo nome.
 */

 public  void dizerNome(){

    System.err.println("Olá, meu nome é: " + getNome());
 }

 /*
 •O método dizerAIdade deve escrever na tela a mensagem: “Olá, eu tenho X
anos”, onde X é o valor do atributo idade.
 */

 public void dizerIdade(){
 System.out.println("OlÁ, eu tenho " + getIdade() + " anos "); 

 }
 /*
 •O método fazerAniversario deve adicionar 1 à idade da Pessoa
 */

 public void fazerAniversario(){
    this.idade +=  1;
  System.err.println("Aniversario: " + idade);
 }


 }
