public class Serie extends Midia{
    private int numeroTemporadas;

    //construtor
    public Serie(String titulo, String sinopse, String genero, String diretor, int ano, String duracao, int numeroTemporadas){
        super(titulo, sinopse, genero, diretor, ano);
        this.numeroTemporadas = numeroTemporadas;
    }

    //get
    public int getNumeroTemporadas() { return numeroTemporadas; }

    //metodos
    // GABIIIII VOCE AQUUII <3
    // reescreve esse metodo aqui. coloquei so p n dar erro no codigo bjos
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo série: " + getTitulo() + " (com o total de" + getNumeroTemporadas() + "temporadas.");
    }
}
