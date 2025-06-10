//public class Main {
//    public static void main(String[] args) {
//        PlataformaStreaming plataforma = new PlataformaStreaming();
//
//        // Criando algumas mídias
//        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", 169, true, true);
//        Filme filme2 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 175, true, false);
//        Serie serie1 = new Serie("Breaking Bad", "Vince Gilligan", 62, true, true);
//        Serie serie2 = new Serie("The Office", "Greg Daniels", "Comédia", false, true);
//
//        // Adicionando ao catálogo da plataforma
//        plataforma.adicionarMidia(filme1);
//        plataforma.adicionarMidia(filme2);
//        plataforma.adicionarMidia(serie1);
//        plataforma.adicionarMidia(serie2);
//
//        // Criando usuários
//        Usuario usuario1 = new Usuario("Ana");
//        Usuario usuario2 = new Usuario("Carlos");
//
//        // Cadastrando os usuários
//        plataforma.cadastrarUsuario(usuario1);
//        plataforma.cadastrarUsuario(usuario2);
//
//        // Exibindo o catálogo
//        System.out.println("=== Catálogo da Plataforma ===");
//        plataforma.exibirCatalogo();
//
//        // Criando formas de pagamento
//        MetodoPagamento compra = new Compra();
//        MetodoPagamento aluguel = new Aluguel();
//
//        // Realizando compra de mídia
//        try {
//            plataforma.realizarCompra(usuario1, filme1, compra); // sucesso
//            plataforma.realizarCompra(usuario2, filme2, compra); // sucesso
//            plataforma.realizarCompra(usuario2, serie2, compra); // falha (disponível apenas para aluguel)
//        } catch (MidiaIndisponivelException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        // Realizando aluguel de mídia
//        try {
//            plataforma.realizarAluguel(usuario1, filme2, aluguel); // falha (não disponível para aluguel)
//        } catch (MidiaIndisponivelException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        try {
//            plataforma.realizarAluguel(usuario1, serie1, aluguel); // sucesso
//        } catch (MidiaIndisponivelException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        // Exibindo histórico dos usuários
//        System.out.println("\n=== Histórico de Mídias de " + usuario1.getNome() + " ===");
//        usuario1.listarMidiasCompradas();
//        usuario1.listarMidiasAlugadas();
//
//        System.out.println("\n=== Histórico de Mídias de " + usuario2.getNome() + " ===");
//        usuario2.listarMidiasCompradas();
//        usuario2.listarMidiasAlugadas();
//    }
//}
