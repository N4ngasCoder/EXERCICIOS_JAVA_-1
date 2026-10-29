package EX13;

public class LivroTeste {
    public static void main(String[] args){
        Livro livrofavorito = new Livro("Game of Thrones", 500, 0);
        System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() + " páginas.");
        
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();
        
        livrofavorito.setPaginasLidas(250);
        livrofavorito.verificarProgresso();
    }
}
