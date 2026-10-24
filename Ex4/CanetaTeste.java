package Ex4;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        Caneta caneta2 = new Caneta("Bic", "Azul", 15.0);

        System.out.println("Caneta 1:");
        System.out.println("Marca: " + caneta1.getMarca());
        System.out.println("Cor: " + caneta1.getCor());
        System.out.println("Tamanho: " + caneta1.getTamanho());

        System.out.println("\nCaneta 2:");
        System.out.println("Marca: " + caneta2.getMarca());
        System.out.println("Cor: " + caneta2.getCor());
        System.out.println("Tamanho: " + caneta2.getTamanho());
    }
}