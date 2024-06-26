public class Item {

    String nome;
    int quantidade;
    double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String toString() {
        return "Item: " + nome + " Quantidade: " + quantidade + " Preço (R$): " + String.format("%.2f", preco);
        }
}
