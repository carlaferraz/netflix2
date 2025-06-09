import java.sql.SQLOutput;

public class Filme extends Midia{


    //construtor
    public Filme(String titulo, String sinopse, String genero, String diretor, int ano, String duracao, boolean disponivelParaAlugar, boolean disponivelParaCompra){
        super(titulo, sinopse, genero, diretor, ano, duracao, disponivelParaAlugar, disponivelParaCompra);

    }

    //metodos
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Duração: " + getDuracao());
    }

    @Override
    public void exibirTrailer() {
        System.out.println("Exibindo trailer de: " + getTitulo());
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo filme: " + getTitulo() + " (com duracao de " + getDuracao() + ")");
    }

    @Override
    public void pausar() {
        System.out.println("Filme pausado: " + getTitulo());
    }

    @Override
    public void encerrar() {
        System.out.println("Encerrando o filme: " + getTitulo());
    }
    @Override // herdando de Objetc do proprio java
    public String toString() {
        return "Filme: " + getTitulo() + " (" + getAno() + ") - " + getGenero() +
                "\nDiretor: " + getDiretor() +
                "\nDuração: " + getDuracao() +
                "\nDisponível para aluguel? " + (isDisponivelParaAlugar() ? "Sim" : "Não") +
                "\nDisponível para compra? " + (isDisponivelParaCompra() ? "Sim" : "Não");
    }


}