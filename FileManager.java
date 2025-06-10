import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    private String caminhoArquivo;

    public FileManager(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void verCatalogoFilmes() {
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            if (scanner.hasNextLine()) scanner.nextLine(); // pular cabeçalho

            System.out.println("Catálogo de Filmes:");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(";", -1); // usar ; como separador e -1 para não ignorar campos vazios

                if (dados.length >= 8) {

                    System.out.println("Título: " + dados[0]);
                    System.out.println("Sinopse: " + dados[1]);
                    System.out.println("Gênero: " + dados[2]);
                    System.out.println("Diretor: " + dados[3]);
                    System.out.println("Ano: " + dados[4]);
                    System.out.println("Duração: " + dados[5]);
                    System.out.println("Disponível para Compra: " + dados[6]);
                    System.out.println("Disponível para Aluguel: " + dados[7]);
                    System.out.println("----------------------------------------------------");

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    public void verCatalogoSeries() {
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            if (scanner.hasNextLine()) scanner.nextLine(); // pular cabeçalho

            System.out.println("Catálogo de Séries:");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(";", -1);

                if (dados.length >= 9) {

                    System.out.println("Título: " + dados[0]);
                    System.out.println("Sinopse: " + dados[1]);
                    System.out.println("Gênero: " + dados[2]);
                    System.out.println("Diretor: " + dados[3]);
                    System.out.println("Ano: " + dados[4]);
                    System.out.println("Duração: " + dados[5]);
                    System.out.println("Disponível para Compra: " + dados[6]);
                    System.out.println("Disponível para Aluguel: " + dados[7]);
                    System.out.println("Número de Temporadas: " + dados[8]);
                    System.out.println("----------------------------------------------------");

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}



