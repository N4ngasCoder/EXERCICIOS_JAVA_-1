import java.util.Scanner; 

public class Main{

 static void main(String[] args){
 Scanner sc = new Scanner(System.in);
  
Cliente cliente1 = new Cliente("João", 1);
Cliente Cliente2 = new Cliente("Maria", 2);

System.out.println("Cliente 1: " + cliente1.getNome() 
 + " Codigo : ") + cliente1.getCodigo()); 
 
System.out.println("Cliente 2: " + cliente2.getNome() 
 + " Codigo : ") + cliente2.getCodigo()); 
 }
}