package EX10;

 /*
 10. Implemente uma classe Retângulo que obedeça à descrição abaixo
Retangulo
+ lado1: float
+ lado2: float
+ área: float
+ perimetro: float
+ calcularArea(): void
+ calcularPerimetro(): voidCrie o método main e instancie a classe Retangulo, criando um objeto novoRetangulo do tipo
Retangulo.
• Atribua o valor 10 ao atributo lado1
• Atribua o valor 5 ao atributo lado2
• Chame o método calcularArea.
• Chame o método calcularPerimetro.
• Atribua o valor 7 ao atributo lado2
• Chame o método calcularArea.
• Chame o método calcularPerimetro.
 */
public class Retangulo {
    public float lado1;
    public float lado2;
    public float area;
    public float perimetro;


 public Retangulo(float lado1, float lado2, float area, float perimetro) {

  this.lado1 = lado1;
  this.lado2 = lado2;
  this.area = area; 
  this.perimetro = perimetro; 
    
 }

     public void calcularArea(){
        this.area = this.lado1 * this.lado2;
     }

     public void calcularPerimetro(){
        this.perimetro = 2 * (this.lado1 + this.lado2);
     }
}
