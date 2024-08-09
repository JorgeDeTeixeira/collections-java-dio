public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Estudar");
        System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Faculdade");
        listaTarefa.obterDescricacaoTarefas();
        listaTarefa.removerTarefa("Estudar");
        System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricacaoTarefas();


    }
}
