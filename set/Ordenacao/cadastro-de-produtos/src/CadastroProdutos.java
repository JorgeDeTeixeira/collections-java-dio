import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos = new HashSet<>();

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        if (produtos.isEmpty()) {
            System.out.println("Lista de produtos vazia.");
        } else {
            System.out.println("Produtos ordenados por nome:");
        }
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (produtos.isEmpty()) {
            System.out.println("Lista de produtos vazia.");
        } else {
            System.out.println("Produtos ordenados por preço:");
            produtosPorPreco.addAll(produtos);
        }
        return produtosPorPreco;
    }

}
