public class Serie extends Midia{
    private int numeroTemporadas;

    //construtor
    public Serie(String titulo, String sinopse, String genero, String diretor, int ano, String duracao, boolean disponivelParaAlugar, boolean disponivelParaCompra, int numeroTemporadas){
        super(titulo, sinopse, genero, diretor, ano, duracao, disponivelParaAlugar, disponivelParaCompra);
        this.numeroTemporadas = numeroTemporadas;
    }

    //get
    public int getNumeroTemporadas() {
        return numeroTemporadas; }

    //metodos
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de temporadas: " + numeroTemporadas);
    }
    @Override
    public void exibirTrailer() {
        System.out.println("Exibindo trailer de: " + getTitulo());
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo série: " + getTitulo() + " (com o total de" + getNumeroTemporadas() + "temporadas.");
    }

    @Override
    public void pausar() {
        System.out.println("Série pausado: " + getTitulo());
    }
    @Override
    public void encerrar() {
        System.out.println("Encerrando a série: " + getTitulo());
    }



}
