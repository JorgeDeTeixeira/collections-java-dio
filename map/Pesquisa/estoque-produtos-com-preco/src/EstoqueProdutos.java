import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque = new HashMap<>();

    public void adicionarProduto(long cod, Produto produto) {
        estoque.put(cod, produto);
    }

    public void exibirProduto() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            for (Produto produto : estoque.values()) {
                System.out.println(produto);
            }
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            for (Produto p : estoque.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        if (estoque.isEmpty()) {
            System.out.println("Estoqye vazio!");
        } else {
            double maiorPreco = Double.MIN_VALUE;
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto ProdutoMaisbarato = null;

        if (estoque.isEmpty()) {
            System.out.println("Estoqye vazio!");
        } else {
            double menorPreco = Double.MAX_VALUE;
            for (Produto p : estoque.values()) {
                if (p.getPreco() < menorPreco) {
                    ProdutoMaisbarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return ProdutoMaisbarato;
    }

    public Produto obterProdutoMaiorQuantidadeEstoque() {
        Produto produtoMaiorQuantidade = null;
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            int maiorQuantidade = Integer.MIN_VALUE;
            for (Produto p : estoque.values()) {
                if (p.getQuantidade() > maiorQuantidade) {
                    produtoMaiorQuantidade = p;
                }
            }
        }
        return produtoMaiorQuantidade;
    }
}