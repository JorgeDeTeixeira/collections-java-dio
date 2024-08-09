public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Jorge", 20, 1.70);
        ordenacaoPessoas.adicionarPessoa("Julia", 16, 1.65);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
