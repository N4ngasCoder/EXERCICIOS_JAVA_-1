/*
1. Implemente uma classe que modele um aluno de ginásio:
Atributos: Nome, data de nascimento, peso e altura
Métodos: Calcula Idade
*/

public class Aluno{

    private String nome; 
    private int dataDeNanscimento; 
    private double peso;
    private double altura;

    public Aluno(){
        this.nome = " "; 
         this.dataDeNanscimento = 0000; 
          this.peso = 0.00; 
          this.altura = 0.00; 
    }

     public Aluno(String nome, int dataDeNanscimento, double peso, double altura){
         this.nome = nome; 
         this.dataDeNanscimento = dataDeNanscimento; 
         if(this.peso < 0){
            this.peso = 0.00;
         }else{
            this.peso = peso; 
         }
         
          if(this.altura < 0){
              this.altura = 0;
          }else{
            this.altura = altura; 
          }
     }

     //metodos gets
      public String getNome(){
        return nome; 

      }

      public int getDataDeNascimento(){
        return dataDeNanscimento; 
     }
 
  public double getPeso(){
        return peso; 
  }

   public double getAltura(){

     return altura; 
   }

   //metodos sets: 

   public void setNome(String nome){
    this.nome = nome; 
   }

   public void setDataDeNascimento(int dataDeNanscimento){
     this.dataDeNanscimento = dataDeNanscimento; 
   }

   public void setPeso(double peso){
    this.peso = peso; 
   }

   public void setAltura(double altura){
    this.altura = altura; 
   }
}