
package ex9;

/*
9. Implemente uma classe Porta com os seguintes atributos: aberta, cor, dimX, dimY,
dimZ e com os seguintes métodos void open(), void close(), void paint(String cor),
boolean isOpen(). 

Crie uma porta, abra e feche a mesma, pinte-a de diversas
cores, altere as suas dimensões e use o método isOpen() para verificar se ela está
aberta.
*/

public class Porta {

    private boolean aberta = false; 
    private String cor ; 
    private float dimX; 
    private float dimY;
    private float dimZ; 
    
    public Porta(boolean aberta, String cor, float dimX, float dimY, float dimZ ){
        this.aberta = false;
        this.cor = cor; 
        this.dimX = dimX; 
        this.dimY = dimY; 
        this.dimZ = dimZ; 

    }
    public boolean getAberta() {
        return aberta; 
    }

    public String getCor(){
        return cor; 
    }
    public float getDimX(){
        return dimX;
    }
    public float getDimY(){
        return dimY;
    }
    public float getDimZ(){
        return dimZ;
    }


    public void setAberta(boolean aberta)
 {
     this.aberta = aberta; 
 }

  public void setCor(String cor){
     this.cor = cor; 
  }

  public void setDimx(float dimX) {
    this.dimX = dimX; 
  }

    public void setDimY(float dimY) {
        this.dimY = dimY; 
    }

    public void setDimZ(float dimZ) {
        this.dimZ = dimZ; 
    }

     public void open(){
        this.aberta = true;
     }

     public void close(){
        this.aberta = false;
     }

     public void paint(String cor) {
        this.cor = cor; 
     }

     public boolean isOpen(){
        return this.aberta;
     }
}