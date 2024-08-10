import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros implements Comparable {
    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(Integer numero) {
        numeros.add(numero);
    }

    public void listarNumeros() {
        for (Integer n : numeros) {
            System.out.print(n + " ");
        }
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(n, 0)
    }

}
