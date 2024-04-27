import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private List<Item> itens;

    public Estoque() {
        this.itens = new ArrayList<>();
    }
    public void cadastrarItem(String nome, int quantidade, double preco) {
        Item item = new Item(nome, quantidade, preco);
        itens.add(item);
        System.out.println("Item cadastrado com sucesso!");
    }
    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado no estoque.");
        } else {
            System.out.println("Itens cadastrados no estoque:");
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }
}
