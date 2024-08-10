import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos = new HashSet<Contato>();

    public void adicionarContato(Contato contato) {
        contatos.add(new Contato(contato.getNome(), contato.getTelefone()));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<Contato>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
            }
        }

        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
