import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Usuario[] usuarioHolder = new Usuario[1];

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Abrir Catálogo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                usuarioHolder[0] = new Usuario(nome, email, telefone);
                System.out.println("Usuário cadastrado com sucesso!");

            }   else if (opcao == 2) {
            if (usuarioHolder[0] == null) {
                System.out.println("Cadastre um usuário primeiro.");
            } else {
                SwingUtilities.invokeLater(() -> new Onboarding(usuarioHolder[0]));
            }

            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
