import java.util.ArrayList;

public class PlataformaStreaming {
    private String nomePlataforma;
    private ArrayList<Midia> catalogo;
    private ArrayList<Usuario> usuarios;
    //entao, essa classe eu pensei que poderia representar o sistema que
    //gerencia os usuarios, os filmes e series disponiveis, e as transacoes (compras e alugueis)
    //util p juntar com classes Usuario, Midia e MetodoPagamento

    //construtor
    public PlataformaStreaming(String nomePlataforma){
        this.nomePlataforma = nomePlataforma;
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    //gets
    public String getNomePlataforma(){return nomePlataforma;}
    public ArrayList<Midia> getCatalogo(){return catalogo;}
    public ArrayList<Usuario> getUsuarios(){return usuarios;}

    //metodos
    //WHEN I SEE YOU AGAIN OOOOOOOOOOOOOOOOOO UUUUUOOOOOOOOOO UUUUUUUU
}
