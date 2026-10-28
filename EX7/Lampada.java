package EX7;

/*
Implementar uma classe Lampada que deve possuir como características tipo (led,
fluorescente,), voltagem, cor, marca, preço, potência, status(boolean). Nesta
classe devem ser implementados os métodos construtores, getters, setters,
acender e apagar. Em uma outra classe chamada LampadaTeste devem ser criados
dois objetos do tipo Lampada, atribuir valores e exibir os dados deste objeto. O
programa deverá informar também qual das duas lâmpadas possui maior potência
e também qual das lâmpadas é a mais cara.
*/
public class Lampada {
    private String tipo; 
    private String voltagem; 
    private String cor; 
    private String marca; 
    private double preco; 
    private double potencia; 
    private boolean status; 

    public Lampada(String tipo,String voltagem, String cor, String marca, double preco, double potencia) {

    this.tipo = tipo; 
    this.voltagem = voltagem; 
    this.cor = cor; 
    this.marca = marca; 
    this.preco = preco; 
    this.potencia = potencia; 
    this.status = false; 
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 public boolean acender()
{
  this.status = true; 
  return this.status; 

}
 public boolean apagar(){
    this.status = false; 
    return this.status;
 }
}
