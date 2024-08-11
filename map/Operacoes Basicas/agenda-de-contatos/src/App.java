public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("José", 456789123);
        agendaContatos.adicionarContato("Ana", 654321987);
        agendaContatos.adicionarContato("Carlos", 321987654);

        agendaContatos.listarContatos();

        System.out.println("Pesquisando por nome: " + agendaContatos.pesquisaPorNome("Maria"));

        agendaContatos.removerContato("Maria");

        agendaContatos.listarContatos();
    }
}
