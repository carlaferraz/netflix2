import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private String caminhoArquivo;

    public List<Filme> carregarFilmes() {
        List<Filme> lista = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            if (scanner.hasNextLine()) scanner.nextLine(); // pular cabeçalho

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(";", -1);

                if (dados.length >= 8) {
                    String titulo = dados[0].trim();
                    String sinopse = dados[1].trim();
                    String genero = dados[2].trim();
                    String diretor = dados[3].trim();
                    int ano = Integer.parseInt(dados[4].trim());
                    String duracao = dados[5].trim();
                    boolean disponivelCompra = Boolean.parseBoolean(dados[6].trim());
                    boolean disponivelAluguel = Boolean.parseBoolean(dados[7].trim());

                    Filme filme = new Filme(titulo, sinopse, genero, diretor, ano, duracao, disponivelAluguel, disponivelCompra);
                    lista.add(filme);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao processar dados: " + e.getMessage());
        }
        return lista;
    }


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



