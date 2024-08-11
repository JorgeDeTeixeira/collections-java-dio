import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos = new HashSet<>();

    public void adicionarAluno(Aluno aluno) {
        try {
            alunos.add(aluno);
            System.out.println("Aluno adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao adicionar aluno: " + e.getMessage());
        }
    }

    public void removerAlunos(long matricula) {
        try {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula() == matricula) {
                    alunos.remove(aluno);
                    break;
                }
            }
            System.out.println("Aluno removido com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao remover aluno: " + e.getMessage());
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
        } else {
            System.out.println("Alunos ordenados por nome:");
            for (Aluno aluno : alunosPorNome) {
                System.out.println(aluno);
            }
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
        } else {
            System.out.println("Alunos ordenados por nota:");
            for (Aluno aluno : alunosPorNota) {
                System.out.println(aluno);
            }
        }
    }

    public void listarAlunos() {
        try {
            System.out.println("Lista de alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar alunos: " + e.getMessage());
        }
    }
}
