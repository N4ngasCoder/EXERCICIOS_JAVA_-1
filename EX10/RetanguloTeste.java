package EX10;

public class RetanguloTeste {
    
      public static void main(String[] args) {
      
        Retangulo novoRetangulo = new Retangulo(10, 5, 0, 0);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        System.out.println("Área do retângulo: " + novoRetangulo.area);
        System.out.println("Perímetro do retângulo: " + novoRetangulo.perimetro);

        novoRetangulo.lado2 = 7;
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        System.out.println("Área do retângulo após alterar lado2: " + novoRetangulo.area);
        System.out.println("Perímetro do retângulo após alterar lado2: " + novoRetangulo.perimetro);

      }
}
