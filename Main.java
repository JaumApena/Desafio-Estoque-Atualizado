import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        boolean menu = true;
        while (menu) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar novo item");
            System.out.println("2 - Listar itens cadastrados");
            System.out.println("3 - Sair do programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    estoque.cadastrarItem(nome, quantidade, preco);
                    break;
                case 2:
                    estoque.listarItens();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
