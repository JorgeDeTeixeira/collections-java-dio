public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros numeros = new SomaNumeros();
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            System.out.println("Adicionando numero: " + numero);
            numeros.adicionarNumero(numero);
        }
        System.out.println("Soma dos números: " + numeros.calcularSoma());
        System.out.println("Maior número: " + numeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + numeros.encontrarMenorNumero());
        System.out.println("Numeros: ");
        numeros.exibirNumeros();
    }
}
