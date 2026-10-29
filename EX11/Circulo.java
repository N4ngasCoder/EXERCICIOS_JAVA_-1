package EX11;

/*
11. Crie uma classe Circulo que obedeça à descrição abaixo:
Circulo
+ raio: float
+ area: float
+ perimetro: float
+ calcularArea(): void
+ calcularPerimetro(): void
O perímetro é dado pela forma (perimetro = 2 * 3.14 * raio).

Crie o método main e instancie a classe Círculo, criando um objeto novoCirculo do tipo Circulo.
• Atribua o valor 10 ao atributo raio
• Chame o método calcularArea.
• Escreva no ecrã o valor da área.
• Chame o método calcularPerimetro.
• Escreva no ecrã o valor do perímetro.
• Atribua o valor 4 ao atributo raio
• Chame o método calcularArea.
• Escreva no ecrã o valor da área.
• Chame o método calcularPerimetro.
• Escreva no ecrã o valor do perímetro.

*/
public class Circulo {
    public float raio; 
    public float area; 
    public float perimetro;

 
     public Circulo(float raio, float area, float perimetro){
        this.raio = raio; 
        this.area = area; 
        this.perimetro = perimetro; 
     }

     public  float getRaio(){
        return raio; 
     }

     public float getArea(){
        return area;
     }

     public float getPerimetro(){
        return perimetro; 
     }

     public void setRaio(float raio){
        this.raio = raio;
     }

     public void setArea(float area){
        this.area = raio;
     }

     public  void setPerimetro(float perimetro){
        this.perimetro = perimetro; 
     }
     //calcular area;
     public void calcularArea(){
          this.area = 3.14f*(raio*raio); 
     }

   public void calcularPerimetro(){
      this.perimetro = 2 * 3.14f * this.raio;
   }
}
