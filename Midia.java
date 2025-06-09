public abstract class Midia {

    //atributos
    private String titulo;
    private String sinopse;
    private String genero;
    private String diretor;
    private int ano;
    private String duracao;
    private boolean disponivelParaAlugar;
    private boolean disponivelParaCompra;



    //construtor
    public Midia(String titulo, String sinopse, String genero, String diretor, int ano, String duracao, boolean disponivelParaAlugar, boolean disponivelParaCompra) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
        this.disponivelParaAlugar = disponivelParaAlugar;
        this.disponivelParaCompra = disponivelParaCompra;
    }

    //gets
    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public boolean isDisponivelParaAlugar() {
        return disponivelParaAlugar;
    }

    public boolean isDisponivelParaCompra() {
        return disponivelParaCompra;
    }

    //sets
    public void setDisponivelParaAlugar(boolean disponivel) {
        this.disponivelParaAlugar = disponivel;
    }

    public void setDisponivelParaCompra(boolean disponivel) {
        this.disponivelParaCompra = disponivel;
    }

    //metodo
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Gênero: " + genero);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao);
        System.out.println("Disponível para aluguel? " + (isDisponivelParaAlugar() ? "Sim" : "Não"));
        System.out.println("Disponível para compra? " + (isDisponivelParaCompra() ? "Sim" : "Não"));

    }
    public void exibirTrailer() {
        System.out.println("Exibindo trailer de: " + getTitulo());
    }

    public void reproduzir() {
        System.out.println("Reproduzindo a mídia: " + titulo);
    }

    public void pausar() {
        System.out.println("Mídia pausada: " + getTitulo());
    }

    public void encerrar() {
        System.out.println("Encerrando a mídia: " + getTitulo());
    }

}