package EX7;

public class LampadaTeste {
  
    public static void main(String[] args) {

         Lampada lampada1 = new Lampada("led", "12v", "verde", "marca1", 10.0, 5.0);
         Lampada lampada2 = new Lampada("fluorescente", "220v", "branca", "marca2", 15.0, 10.0);


        System.out.println("Lâmpada 1:");
        System.out.println("Tipo: " + lampada1.getTipo());
        System.out.println("Voltagem: " + lampada1.getVoltagem());
        System.out.println("Cor: " + lampada1.getCor());
        System.out.println("Marca: " + lampada1.getMarca());
        System.out.println("Preço: " + lampada1.getPreco());
        System.out.println("Potência: " + lampada1.getPotencia());
        System.out.println("Status: " + (lampada1.isStatus() ? "Acesa" : "Apagada"));

        System.out.println("\nLâmpada 2:");
        System.out.println("Tipo: " + lampada2.getTipo());
        System.out.println("Voltagem: " + lampada2.getVoltagem());
        System.out.println("Cor: " + lampada2.getCor());
        System.out.println("Marca: " + lampada2.getMarca());
        System.out.println("Preço: " + lampada2.getPreco());
        System.out.println("Potência: " + lampada2.getPotencia());
        System.out.println("Status: " + (lampada2.isStatus() ? "Acesa" : "Apagada"));

        if(lampada1.getPotencia() > lampada2.getPotencia()) {
            System.out.println("A lampada 1 É mais potente que a lampada 2");
        } else if(lampada2.getPotencia() > lampada1.getPotencia()) {
            System.out.println("A lampada 2 É mais potente que a lampada 1");
        } else {
            System.out.println("As lâmpadas têm a mesma potência");
        }

        if(lampada1.getPreco() > lampada2.getPreco()) {
            System.out.println("A lampada 1 É mais cara que a lampada 2");
        } else if(lampada2.getPreco() > lampada1.getPreco()) {
            System.out.println("A lampada 2 É mais cara que a lampada 1");
        } else {
            System.out.println("As lâmpadas têm o mesmo preço");
        }
    }
}
