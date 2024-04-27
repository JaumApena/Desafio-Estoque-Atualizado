import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        boolean menu = true;
        while (menu) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar um item");
            System.out.println("2 - Listar itens ");
            System.out.println("3 - Desligar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do item: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço do item: ");
                    double preco = scanner.nextDouble();
                    estoque.cadastrarItem(nome, quantidade, preco);
                    break;
                case 2:
                    estoque.listarItens();
                    break;
                case 3:
                    System.out.println("Desligando programa...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
