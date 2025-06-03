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

    @Override
    public void descricao(){
        System.out.println("Descrição do Filme:");
        System.out.println("Título: " + this.getTitulo() );
        System.out.println("Sinopse: " + this.getSinopse() );
        System.out.println("Genero: " + this.getGenero() );
        System.out.println("Diretor: " + this.getDiretor() );
        System.out.println("Genero: " + this.getGenero() );
        System.out.println("Duracão: " + this.getDuracao());
        System.out.println("--------------------------------");
    }
}
