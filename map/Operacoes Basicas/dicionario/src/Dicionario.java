import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario = new HashMap<String, String>();

    public void exibirPalavras() {
        if (dicionario.isEmpty()) {
            System.out.println("Dicionário vazio");
        } else {
            for (String palavra : dicionario.keySet()) {
                System.out.println(palavra + ": " + dicionario.get(palavra));
            }
        }
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (dicionario.isEmpty()) {
            System.out.println("Dicionário vazio.");
        } else {
            System.out.println("Palavra removida");
            dicionario.remove(palavra);
        }
    }

    public void pesquisarPorPalavra(String palavra) {
        if (dicionario.isEmpty()) {
            System.out.println("Dicionário vazio.");
        } else {
            if (dicionario.containsKey(palavra)) {
                System.out.println(palavra + ": " + dicionario.get(palavra));
            } else {
                System.out.println("Palavra não encontrada.");
            }
        }
    }
}
