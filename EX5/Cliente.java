package EX5;

/*
Implemente uma classe para definir os object
os que representarão os clientes de
um banco. Essa classe deve declarar dois atributos: 
um para os nomes e outro para
os códigos dos clientes. No final efectue um teste 
criando dois objectos da classe
cliente e imprima seus dados.
*/
public class Cliente {
 private String nome; 
 private int codigo; 
 
  public Cliente(String nome, int codigo){
    this.nome = nome; 
    this.codigo = codigo;
}

public String getNome() {
    return nome;
}

public void setNome(String nome ){
    this.nome = nome; 
}

public int getCodigo() {
    return codigo; 
}
public void setCodigo(int codigo) {
    this.codigo = codigo; 
}
}
