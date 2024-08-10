import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String nome, String autor, int anoPublicacao) {
        this.livros.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor() != null && livro.getAutor().equals(autor)) {
                    livrosEncontrados.add(livro);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisaPorIntevalorAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosEncontrados.add(livro);
                }
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    return livro;
                }
            }
        }
        return null;
    }

}
