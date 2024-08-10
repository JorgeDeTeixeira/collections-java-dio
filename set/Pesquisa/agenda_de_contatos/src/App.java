public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato(new Contato("João", 123456789));
        agenda.adicionarContato(new Contato("Maria", 987654321));
        agenda.adicionarContato(new Contato("Maria", 987654321));
        agenda.adicionarContato(new Contato("José", 456789123));

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Jo"));

        System.out.println(agenda.atualizarNumeroContato("Maria", 111111111));

        agenda.exibirContatos();
    }
}
