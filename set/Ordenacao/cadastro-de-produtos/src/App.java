public class App {
    public static void main(String[] args) throws Exception {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto("Feijão", 1, 5.0, 10);
        cadastro.adicionarProduto("Arroz", 2, 3.0, 20);
        cadastro.adicionarProduto("Macarrão", 3, 2.0, 30);
        cadastro.adicionarProduto("Açúcar", 4, 4.0, 40);

        System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println();

        System.out.println(cadastro.exibirPorPreco());
    }
}
