/*
Faça um programa que sumule um televisor 
criando-o como um objecto:
• O utilizador deve ser capaz de informar 
o número do canal e aumentar ou
diminuir o volume.
• Certifique-se de que o número do canal e
 o nível do volume permanecem
dentro de faixas válidas

*/

 public class Televisor{
    private int numCanal; 
    private int volume; 

    public Televisor(){
        this.numCanal = 1; 
         this.volume = 0; 
    }

    public Televisor(int numCanal, int volume){
        
        if( numCanal >= 1 && numCanal <= 100){
            this.numCanal = numCanal; 
        }
        if(volume >= 0 && volume <= 100){
            this.volume = volume; 
        }
    }

    public  int getNumCanal(){
        return numCanal; 
    }

    public  int getVolume(){
        return volume; 
    }

    public void setNumCanal(int numCanal){
       if(numCanal >= 1 && numCanal <= 100){
         this.numCanal = numCanal; 
       }else{
        System.out.println("Canal Inválido"); 
       }
    }

    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
       this.volume = volume;
        }else{
            System.out.println("volume Inválido");
        }

    }

    public int informarCanal(int canal){
        return getNumCanal(); 
    }

    public void aumentarVolume(){
    if(this.volume < 100){
        this.volume++;
    }
}
      
   

  public void diminuirVolume(){
    if(this.volume > 0){
        this.volume--;
    }
}
      
    }  
  
 
 