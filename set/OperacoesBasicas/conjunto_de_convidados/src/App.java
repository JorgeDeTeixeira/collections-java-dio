public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        System.out.println("Existem " + conjunto.contarConvidados() + " convidados na lista.");

        conjunto.adicionarConvidado("João", 1);
        conjunto.adicionarConvidado("Maria", 2);
        conjunto.adicionarConvidado("José", 3);
        conjunto.adicionarConvidado("Ana", 4);
        conjunto.adicionarConvidado("Carlos", 5);

        System.out.println("Existem " + conjunto.contarConvidados() + " convidados na lista.");

        conjunto.exibirConvidados();

        conjunto.removerConvidadoPorCodigoConvite(3);
        conjunto.removerConvidadoPorCodigoConvite(6);

        System.out.println("Existem " + conjunto.contarConvidados() + " convidados na lista.");

        conjunto.exibirConvidados();
    }
}
