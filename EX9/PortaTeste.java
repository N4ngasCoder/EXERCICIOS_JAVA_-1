import java.util.Scanner; 
public class PortaTeste {


    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite a cor da porta: ");
        String cor = sc.nextLine(); 
        System.out.println("Digite a dimensão X da porta: ");
        float dimX = sc.nextFloat(); 
        System.out.println("Digite a dimensão Y da porta: ");
        float dimY = sc.nextFloat(); 
        System.out.println("Digite a dimensão Z da porta: ");
        float dimZ = sc.nextFloat(); 

        Porta porta1 = new Porta(false, cor, dimX, dimY, dimZ); 

        System.out.println("A porta está aberta? " + porta1.getAberta());
        System.out.println("A cor da porta é: " + porta1.getCor());
        System.out.println("As dimensões da porta são: " + porta1.getDimX() + " x " + porta1.getDimY() + " x " + porta1.getDimZ());

        porta1.open();
        System.out.println("A porta foi aberta.");
        System.out.println("A porta está aberta? " + porta1.getAberta());

    }

}