import java.sql.SQLOutput;

public class Filme extends Midia{

    private String duracao;

    //construtor
    public Filme(String titulo, String sinopse, String genero, String diretor, int ano, String duracao){
        super(titulo, sinopse, genero, diretor, ano);
        this.duracao = duracao;
    }

    //get
    public String getDuracao(){return duracao;}

    //metodos
    // GABIIIII VOCE AQUUII <3
    // reescreve esse metodo aqui. coloquei so p n dar erro no codigo bjos
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo filme: " + getTitulo() + " (com duracao de " + getDuracao() + ")");
    }

}
