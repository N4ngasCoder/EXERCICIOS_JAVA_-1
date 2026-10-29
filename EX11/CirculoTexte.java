package EX11;
/*

Crie o método main e instancie a classe Círculo, criando um objeto novoCirculo 
do tipo Circulo.
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
public class CirculoTexte {
    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo(0, 0, 0);

        // Primeira instância
        novoCirculo.setRaio(10);
        novoCirculo.calcularArea();
        System.out.println("Área: " + novoCirculo.getArea());
        novoCirculo.calcularPerimetro();
        System.out.println("Perímetro: " + novoCirculo.getPerimetro());

        // Segunda instância
        novoCirculo.setRaio(4);
        novoCirculo.calcularArea();
        System.out.println("Área: " + novoCirculo.getArea());
        novoCirculo.calcularPerimetro();
        System.out.println("Perímetro: " + novoCirculo.getPerimetro());
    }
}
