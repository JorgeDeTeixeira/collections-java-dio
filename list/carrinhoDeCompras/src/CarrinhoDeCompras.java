import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> items;

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : items) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }

        items.removeAll(itemsParaRemover);
    }

    public Double calcularValorTotal() {
        double total = 0;
        for (Item i : items) {
            total += i.getPreco();
        }
        return total;
    }

    public void exibirItems() {
        System.out.println(items.toString());
    }

}
