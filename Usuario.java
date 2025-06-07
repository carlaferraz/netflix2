import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private ArrayList<Midia> midiasCompradas;
    private ArrayList<Midia> midiasAlugadas;

    //construtor
    public Usuario(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.midiasCompradas = new ArrayList<>();
        this.midiasAlugadas = new ArrayList<>();
    }

    //gets
    public String getNome(){return nome;}
    public String getEmail(){return email;}
    public String getTelefone(){return telefone;}
    public ArrayList<Midia> getMidiasCompradas() {return midiasCompradas;}
    public ArrayList<Midia> getMidiasAlugadas() {return midiasAlugadas;}

    //metodos
    //HOLA BUENAS NOCHES DE SUENO. SUA PARTE AQUI
}
