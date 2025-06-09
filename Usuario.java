import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private ArrayList<Midia> midiasCompradas;
    private ArrayList<Midia> midiasAlugadas;

    //construtor
    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.midiasCompradas = new ArrayList<>();
        this.midiasAlugadas = new ArrayList<>();
    }

    //gets
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public ArrayList<Midia> getMidiasCompradas() {
        return midiasCompradas;
    }

    public ArrayList<Midia> getMidiasAlugadas() {
        return midiasAlugadas;
    }

    //metodos
    public void comprarMidia(Midia midia) {
        midiasCompradas.add(midia);
        System.out.println("Mídia comprada: " + midia.getTitulo());
    }

    public void alugarMidia(Midia midia) {
        midiasAlugadas.add(midia);
        System.out.println("Mídia alugada: " + midia.getTitulo());
    }

    public void listarMidiasCompradas() {
        System.out.println(" Mídias Compradas por " + nome + ":");
        for (Midia m : midiasCompradas) {
            m.exibirDetalhes(); // chamada Polimorfica (metodo da classe Midia)
            System.out.println("-------------");
        }
    }

    public void listarMidiasAlugadas() {
        System.out.println(" Mídias Alugadas por " + nome + ":");
        for (Midia m : midiasAlugadas) {
            m.exibirDetalhes(); // chamada Polimorfica (metodo da classe Midia)
            System.out.println("-------------");
        }
    }

    public void removerMidiaComprada(Midia midia) {
        if (midiasCompradas.remove(midia)) {
            System.out.println("Mídia removida da lista de compras: " + midia.getTitulo());
        } else {
            System.out.println("Mídia não encontrada na lista de compras.");
        }
    }


    public void removerMidiaAlugada(Midia midia) {
        if (midiasAlugadas.remove(midia)) {
            System.out.println("Mídia removida da lista de alugadas: " + midia.getTitulo());
        } else {
            System.out.println("Mídia não encontrada na lista de alugadas.");
        }
    }
}

