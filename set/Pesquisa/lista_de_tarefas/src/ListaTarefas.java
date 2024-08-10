import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas = new HashSet<>();

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas vazia!");
        } else {
            for (Tarefa t : tarefas) {
                System.out.println(t);
            }
        }
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas vazia!");
        } else {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equals(descricao)) {
                    tarefas.remove(t);
                    System.out.println("Tarefa removida com sucesso!");
                    break;
                }
            }
        }
    }

    public void contarTarefas() {
        System.out.println("Total de tarefas: " + tarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.isFinalizada()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendadentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.isFinalizada()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaComoConcluida(String descricao) {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas vazia!");
        } else {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (t.isFinalizada()) {
                        System.out.println("Tarefa " + descricao + " já está concluída!");
                    } else {
                        t.setFinalizada(true);
                        System.out.println("Tarefa " + descricao + " marcada como concluída!");
                    }
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas vazia!");
        } else {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (!t.isFinalizada()) {
                        System.out.println("Tarefa" + descricao + " já está pendente!");
                    } else {
                        t.setFinalizada(false);
                        System.out.println("Tarefa " + descricao + " marcada como pendente!");
                    }
                    break;
                }
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
        System.out.println("Lista de tarefas limpa!");
    }
}
