public class App {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Java: Como Programar", "Deitel", 2018);
        catalogo.adicionarLivro("Java: Como Programar 2.0", "Deitel", 2018);
        catalogo.adicionarLivro("Java: Como Programar 3.0", "Deitel", 2018);

        System.out.println(catalogo.pesquisaPorTitulo("Java: Como Programar 3.0"));
    }
}
