import java.util.Comparator;

public class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno2.getNota(), aluno1.getNota());
    }
}
