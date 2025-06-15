//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        PlataformaStreaming plataforma = new PlataformaStreaming("Minha Plataforma");
//        Scanner sc = new Scanner(System.in);
//
//
//
//        boolean rodando = true;
//
//        while (rodando) {
//            System.out.println("\n--- MENU ---");
//            System.out.println("1 - Cadastrar usuário");
//            System.out.println("2 - Listar mídias");
//            System.out.println("3 - Listar usuários");
//            System.out.println("4 - Comprar mídia");
//            System.out.println("5 - Alugar mídia");
//            System.out.println("6 - Listar mídias compradas de um usuário");
//            System.out.println("7 - Listar mídias alugadas de um usuário");
//            System.out.println("8 - Resumo de transações");
//            System.out.println("0 - Sair");
//            System.out.print("Escolha uma opção: ");
//            int opcao = sc.nextInt();
//            sc.nextLine(); // consumir newline
//
//            switch (opcao) {
//                case 1 -> {
//                    System.out.print("Nome do usuário: ");
//                    String nome = sc.nextLine();
//                    System.out.print("Email do usuário: ");
//                    String email = sc.nextLine();
//                    System.out.print("Telefone do usuário: ");
//                    String telefone = sc.nextLine();
//                    Usuario usuario = new Usuario(nome, email, telefone);
//                    plataforma.adicionarUsuario(usuario);
//                }
//                case 2 -> plataforma.listarCatalogo();
//                case 3 -> plataforma.listarUsuarios();
//                case 4 -> {
//                    Usuario comprador = escolherUsuario(plataforma, sc);
//                    Midia midiaCompra = escolherMidia(plataforma, sc);
//                    if (comprador != null && midiaCompra != null) {
//                        System.out.print("Valor da compra: R$ ");
//                        double valor = sc.nextDouble();
//                        sc.nextLine();
//                        System.out.print("Forma de pagamento (cartao, pix, etc): ");
//                        String forma = sc.nextLine();
//
//                        System.out.print("Compra à vista? (s/n): ");
//                        boolean avista = sc.nextLine().equalsIgnoreCase("s");
//                        double desconto = 0;
//                        boolean parcelado = false;
//                        int parcelas = 0;
//                        if (avista) {
//                            System.out.print("Informe o desconto (0 se nenhum): ");
//                            desconto = sc.nextDouble();
//                            sc.nextLine();
//                        } else {
//                            System.out.print("Compra parcelada? (s/n): ");
//                            parcelado = sc.nextLine().equalsIgnoreCase("s");
//                            if (parcelado) {
//                                System.out.print("Número de parcelas: ");
//                                parcelas = sc.nextInt();
//                                sc.nextLine();
//                            }
//                        }
//                        Compra compra = new Compra(valor, forma, avista ? "à vista" : "parcelado", avista, desconto, parcelado, parcelas);
//                        plataforma.realizarCompra(comprador, midiaCompra, compra);
//                    }
//                }
//                case 5 -> {
//                    Usuario locatario = escolherUsuario(plataforma, sc);
//                    Midia midiaAluguel = escolherMidia(plataforma, sc);
//                    if (locatario != null && midiaAluguel != null) {
//                        System.out.print("Valor do aluguel: R$ ");
//                        double valor = sc.nextDouble();
//                        System.out.print("Dias de aluguel: ");
//                        int dias = sc.nextInt();
//                        sc.nextLine();
//                        System.out.print("Forma de pagamento (cartao, pix, etc): ");
//                        String forma = sc.nextLine();
//
//                        Aluguel aluguel = new Aluguel(valor, forma, dias);
//                        plataforma.realizarAluguel(locatario, midiaAluguel, aluguel);
//                    }
//                }
//                case 6 -> {
//                    Usuario u = escolherUsuario(plataforma, sc);
//                    if (u != null) {
//                        u.listarMidiasCompradas();
//                    }
//                }
//                case 7 -> {
//                    Usuario u = escolherUsuario(plataforma, sc);
//                    if (u != null) {
//                        u.listarMidiasAlugadas();
//                    }
//                }
//                case 8 -> plataforma.exibirResumoTransacoes();
//                case 0 -> {
//                    System.out.println("Saindo...");
//                    rodando = false;
//                }
//                default -> System.out.println("Opção inválida!");
//            }
//        }
//        sc.close();
//    }
//
//    private static Usuario escolherUsuario(PlataformaStreaming plataforma, Scanner sc) {
//        System.out.println("Escolha um usuário pelo índice:");
//        for (int i = 0; i < plataforma.getUsuarios().size(); i++) {
//            System.out.println(i + " - " + plataforma.getUsuarios().get(i).getNome());
//        }
//        if (plataforma.getUsuarios().isEmpty()) {
//            System.out.println("Nenhum usuário cadastrado.");
//            return null;
//        }
//        System.out.print("Índice do usuário: ");
//        int idx = sc.nextInt();
//        sc.nextLine();
//        if (idx >= 0 && idx < plataforma.getUsuarios().size()) {
//            return plataforma.getUsuarios().get(idx);
//        }
//        System.out.println("Usuário inválido.");
//        return null;
//    }
//
//    private static Midia escolherMidia(PlataformaStreaming plataforma, Scanner sc) {
//        System.out.println("Escolha uma mídia pelo índice:");
//        for (int i = 0; i < plataforma.getCatalogo().size(); i++) {
//            System.out.println(i + " - " + plataforma.getCatalogo().get(i).getTitulo());
//        }
//        if (plataforma.getCatalogo().isEmpty()) {
//            System.out.println("Nenhuma mídia disponível.");
//            return null;
//        }
//        System.out.print("Índice da mídia: ");
//        int idx = sc.nextInt();
//        sc.nextLine();
//        if (idx >= 0 && idx < plataforma.getCatalogo().size()) {
//            return plataforma.getCatalogo().get(idx);
//        }
//        System.out.println("Mídia inválida.");
//        return null;
//    }
//}
