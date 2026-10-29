package EX14;

/*
Contacto - classe que permite instanciar objectos que representam um contacto,
contendo informação sobre o nome e o número de telefone desse contacto.
*/
public class Contacto {
    private String nome;
    private int telefone;

    public Contacto(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }
}
