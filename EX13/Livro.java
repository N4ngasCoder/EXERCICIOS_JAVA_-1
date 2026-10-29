package EX13;

/*
13. Implemente a classe Livros em Java, que obedeça à descrição abaixo
• O método verificarProgresso deverá calcular a percentagem de leitura do
livro até o momento através da fórmula: percentagem = paginasLidas * 100 / qtdPaginas
O valor da percentagem deverá ser mostrado no ecrã conforme a mensagem “Você já leu
X por
cento do livro”, onde o valor de X é o valor calculado pela fórmula apresentada
anteriormente.
Crie uma classe TestarLivros, esssa classe terá apenas o método main que servirá para
testar a classe Livros. As seguintes ações devem ser realizadas:
• Crie um objeto livrofavorito do tipo Livro;
• Altere o atributo titulo para “Game of Thrones”
• Altere o atributo qtdPaginas para 500;•

Escreva no ecrã a mensagem: “O livro X possui Y páginas”, onde no lugar de X
deverá aparecer o valor do atributo titulo e, no lugar de Y deverá aparecer o valor
do atributo qtdPaginas.
Altere a quantidade de paginasLidas para 50;
Chame o método verificarProgresso.
Altere a quantidade de paginasLidas para 250;
Chame o método verificarProgresso.
Implemente um método construtor na classe que vai os 3 atributos da classe como
parâmetro
Crie um livro ao seu critério utilizando o construtor

*/
public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void verificarProgresso(){
        if(paginasLidas >= qtdPaginas){
         System.out.println("Voce terminou de ler o livro");
        }else{
            System.out.println("Voce ainda não terminou de ler o livro");
        }
    }
}
