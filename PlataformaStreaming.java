import java.util.ArrayList;

public class PlataformaStreaming {
    private String nomePlataforma;
    private ArrayList<Midia> catalogo;
    private ArrayList<Usuario> usuarios;

    private int totalCompras;
    private int totalAlugueis;


    //construtor
    public PlataformaStreaming(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.totalCompras = 0;
        this.totalAlugueis = 0;
    }

    //gets
    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public ArrayList<Midia> getCatalogo() {
        return catalogo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }


    //metodos
    //adicionar midia ao catologo
    public void adicionarMidia(Midia midia) {
        catalogo.add(midia);
        System.out.println("Mídia adicionada ao catálogo: " + midia.getTitulo());
    }

    //adicionar usuário à plataforma
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    //mídias disponíveis
    public void listarCatalogo() {
        System.out.println(" Catálogo da plataforma " + nomePlataforma + ":");
        if (catalogo.isEmpty()) {
            System.out.println("Nenhuma mídia disponível no catálogo.");
        } else {
            for (Midia m : catalogo) {
                m.exibirDetalhes(); // chamada polimórfica (metodo em Midia)
                System.out.println("-------------");
            }
        }
    }

    //usuários cadastrados
    public void listarUsuarios() {
        System.out.println(" Usuários cadastrados na plataforma " + nomePlataforma + ":");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario u : usuarios) {
                System.out.println("Nome: " + u.getNome());
                System.out.println("Email: " + u.getEmail());
                System.out.println("Telefone: " + u.getTelefone());
                System.out.println("-------------");
            }
        }
    }

    public void realizarCompra(Usuario usuario, Midia midia, MetodoPagamento pagamento) {
        usuario.comprarMidia(midia);
        pagamento.processarPagamento();
        totalCompras++;
        System.out.println("Compra realizada com sucesso para " + usuario.getNome());
    }

    public void realizarAluguel(Usuario usuario, Midia midia, MetodoPagamento pagamento) {
        usuario.alugarMidia(midia);
        pagamento.processarPagamento();
        totalAlugueis++;
        System.out.println("Aluguel realizado com sucesso para " + usuario.getNome());
    }

    public void exibirResumoTransacoes() {
        System.out.println("Resumo de transações da plataforma " + nomePlataforma + ":");
        System.out.println("Total de compras realizadas: " + totalCompras);
        System.out.println("Total de aluguéis realizados: " + totalAlugueis);
    }
}

