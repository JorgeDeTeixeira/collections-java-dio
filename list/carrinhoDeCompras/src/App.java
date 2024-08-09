public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Fone", 150.0, 1);
        carrinho.adicionarItem("Cadeira", 500.0, 1);
        carrinho.exibirItems();
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("Cadeira");
        carrinho.exibirItems();


    }
}
