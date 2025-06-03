public abstract class Midia {

    //atributos
    private String titulo;
    private String sinopse;
    private String genero;
    private String diretor;
    private int ano;

    //construtor
    public Midia(String titulo, String sinopse, String genero, String diretor, int ano){
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
    }

    //gets
    public String getTitulo(){return titulo;}
    public String getSinopse(){return sinopse;}
    public String getGenero(){return genero;}
    public String getDiretor(){return diretor;}
    public int getAno(){return ano;}

    //metodos
    abstract void descricao();

}
