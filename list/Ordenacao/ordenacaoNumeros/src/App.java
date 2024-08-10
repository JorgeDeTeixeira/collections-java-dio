public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            System.out.println("Adicionando numero: " + numero);
            ordenacaoNumeros.adicionarNumero(numero);
        }

        ordenacaoNumeros.listarNumeros();
    }
}
