public class App {
    public static void main(String[] args) throws Exception {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Linguagem de programação");
        dicionario.adicionarPalavra("Python", "Linguagem de programação");
        dicionario.adicionarPalavra("C#", "Linguagem de programação");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Java");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Python");
        dicionario.pesquisarPorPalavra("Java");
    }
}
