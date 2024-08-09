import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode ser nula ou vazia.");
        }

        int maior = numeros.get(0);
        for (int numero : numeros) {
            if (numero < maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode ser nula ou vazia.");
        }

        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero > menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}