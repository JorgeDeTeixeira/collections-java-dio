public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProduto();

        Produto p1 = new Produto("Arroz", 10.0, 5);
        Produto p2 = new Produto("Feijão", 5.0, 10);
        Produto p3 = new Produto("Macarrão", 3.0, 20);
        Produto p4 = new Produto("Carne", 50.0, 2);
        Produto p5 = new Produto("Frango", 20.0, 3);

        estoque.adicionarProduto(1, p1);
        estoque.adicionarProduto(2, p2);
        estoque.adicionarProduto(3, p3);
        estoque.adicionarProduto(4, p4);
        estoque.adicionarProduto(5, p5);

        estoque.exibirProduto();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade em estoque: " + estoque.obterProdutoMaiorQuantidadeEstoque());
    }
}
