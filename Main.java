import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileManager fmFilmes = new FileManager("database/filmes.csv");
        FileManager fmSeries = new FileManager("database/Serie.csv");

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ver catálogo de Filmes");
        System.out.println("2 - Ver catálogo de Séries");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        if (opcao == 1) {
            fmFilmes.verCatalogoFilmes();
        } else if (opcao == 2) {
            fmSeries.verCatalogoSeries();
        } else {
            System.out.println("Opção inválida.");
        }

        input.close();
    }
}

