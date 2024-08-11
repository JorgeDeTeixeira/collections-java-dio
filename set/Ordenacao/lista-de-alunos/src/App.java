public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        Aluno aluno1 = new Aluno("João", 123456, 9.5);
        Aluno aluno2 = new Aluno("Maria", 654321, 8.5);
        Aluno aluno3 = new Aluno("José", 123456, 7.5);
        Aluno aluno4 = new Aluno("Ana", 987654, 6.5);
        Aluno aluno5 = new Aluno("Pedro", 456789, 5.5);
        Aluno aluno6 = new Aluno("Carlos", 456789, 5.5);

        gerenciador.adicionarAluno(aluno1);
        gerenciador.adicionarAluno(aluno2);
        gerenciador.adicionarAluno(aluno3);
        gerenciador.adicionarAluno(aluno4);
        gerenciador.adicionarAluno(aluno5);
        gerenciador.adicionarAluno(aluno6);

        gerenciador.exibirAlunosPorNome();
        System.out.println();
        gerenciador.exibirAlunosPorNota();
    }
}
