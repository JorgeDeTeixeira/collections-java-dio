public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("C++");

        
        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Java");
        conjunto.removerPalavra("C#");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("Python");
        conjunto.verificarPalavra("C#");
    }
}
