public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Spring Boot");
        lista.adicionarTarefa("Estudar Spring Data JPA");
        lista.adicionarTarefa("Estudar Spring Security");

        System.out.println();
        lista.marcarTarefaComoConcluida("Estudar Java");
        lista.marcarTarefaComoConcluida("Estudar Java");
        System.out.println();

        lista.marcarTarefaPendente("Estudar Java");
        lista.marcarTarefaPendente("Estudar Java");
        System.out.println();

        System.out.println("Listando tarefas concluídas");
        System.out.println(lista.obterTarefasConcluidas());

        System.out.println("Listando tarefas pendentes");
        System.out.println(lista.obterTarefasPendadentes());

        lista.limparListaTarefas();

        lista.contarTarefas();
        lista.exibirTarefas();

    }
}
