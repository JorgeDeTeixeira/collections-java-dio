import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos = new HashMap<String, Integer>();

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos para remover");
        } else {
            System.out.println("Contato removido com sucesso");
            contatos.remove(nome);
        }
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos para pesquisar");
        } else {
            numeroPorNome = contatos.get(nome);
        }

        return numeroPorNome;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos para listar");
        } else {
            System.out.println("Contatos:");
            for (Map.Entry<String, Integer> contato : contatos.entrySet()) {
                System.out.println("Nome: " + contato.getKey() + " - Telefone: " + contato.getValue());
            }
        }
    }
}
