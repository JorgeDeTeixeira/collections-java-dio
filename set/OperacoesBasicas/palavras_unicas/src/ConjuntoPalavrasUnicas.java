import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavras.isEmpty()) {
            System.out.println("Conjunto vazio");
        } else {
            boolean palavraEncontrada = false;

            for (String p : palavras) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraEncontrada = true;
                    break;
                }
            }
            if (palavraEncontrada) {
                palavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        }
    }

    public void verificarPalavra(String palavra) {
        if (palavras.isEmpty()) {
            System.out.println("Conjunto vazio");
        } else {
            boolean palavraEncontrada = false;

            for (String p : palavras) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraEncontrada = true;
                    break;
                }
            }
            if (palavraEncontrada) {
                System.out.println("Palavra encontrada");
            } else {
                System.out.println("Palavra não encontrada");
            }
        }
    }

    public void exibirPalavrasUnicas() {
        if (palavras.isEmpty()) {
            System.out.println("Conjunto vazio");
        } else {
            for (String p : palavras) {
                System.out.println(p);
            }
        }
    }
}
