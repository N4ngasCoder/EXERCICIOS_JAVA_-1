package EX8;
/*
•Crie também um método main que realize as seguintes operações:
o Instancie um objeto do tipo Pessoa.

o Atribua o seu nome ao atributo nome.
o Atribua a sua idade ao atributo idade.
o Chame o método dizerONome
o Chame o método dizerAIdade
o Chame o método fazerAniversario

*/
public class main {
    
public static void main(String[] args){
  Pessoa pessoa1 = new Pessoa("Joaquina",24);

  pessoa1.dizerNome();
  pessoa1.dizerIdade();
  pessoa1.fazerAniversario();
    }
}
