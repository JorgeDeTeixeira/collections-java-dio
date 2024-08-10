import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvidado() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        if (convidadoParaRemover != null) {
            convidados.remove(convidadoParaRemover);
        } else {
            System.out.println("Convidado não encontrado.");
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }
}
