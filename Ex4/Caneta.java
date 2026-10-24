package Ex4;

/*
Implementar uma classe Caneta que deve possuir como características 
marca, cor
e tamanho. Nesta classe devem ser implementados os métodos 
construtores,
getters, setters. Em uma outra classe chamada CanetaTeste deverá 
ser criado um
objeto do tipo Caneta, atribuir valores e exibir os dados deste
objeto.
*/
public class Caneta {
  private String marca; 
  private String cor; 
  private double tamanho; 

  public Caneta(){
    this.marca = "Sem marca";
    this.cor = "Sem cor"; 
    this.tamanho = 0.0; 
  }
  public Caneta(String marca, String cor, double tamanho){
    this.marca = marca; 
    this.cor = cor; 
    this.tamanho = tamanho; 
  }
  public String getMarca()
{
    return marca; 
}  

public void setMarca(String marca){
    this.marca = marca; 
}

 public String getCor(){
    return cor;
 }

 public void setCor(String cor){
    this.cor = cor; 
 }

  public double getTamanho(){
    return tamanho; 
  }

  public void setTamanho (double tamanho){
    this.tamanho = tamanho; 
  }
  
}
