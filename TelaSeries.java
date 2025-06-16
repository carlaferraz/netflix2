import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class TelaSeries extends JFrame {
    private DefaultListModel<String> listaModel;
    private JList<String> listaSeries;
    private List<Filme> filmes;
    private JButton btnComprar;
    private JButton btnAlugar;
    private JButton voltar;

    //setando preços fixos p facilitar minha vida
    private final double precoAluguel = 2.99;
    private final double precoCompra = 19.99;




    //pedindo os dados do aluguel do filme
    private void pedirDadosAluguel() {
        //criando caixa p escolher os dias de aluguel
        Integer[] opcoesDias = {1, 2, 3, 4, 5 ,6, 7};
        Integer dias = (Integer) JOptionPane.showInputDialog(this,
                "Quantos dias deseja alugar?", "Dias de Aluguel",
                //mostrando ícone com interrogação azul, indicando que o usuário precisa responder algo
                //null = sem imagem de icone
                JOptionPane.QUESTION_MESSAGE, null,
                opcoesDias, opcoesDias[0]);

        //criando caixa p escolher a forma de pagamento
        String[] formasPagamento = {"Cartão", "Dinheiro", "Pix", "Boleto"};
        String formaPagamento = (String) JOptionPane.showInputDialog(this,
                "Escolha a forma de pagamento:", "Forma de Pagamento",
                //mostrando ícone com interrogação azul, indicando que o usuário precisa responder algo
                JOptionPane.QUESTION_MESSAGE, null,
                formasPagamento, formasPagamento[0]);
        //formasPagamento[0] = valor inicial setado na caixinha


        //colocando o metodo que criamos na classe Aluguel.java
        Aluguel aluguel = new Aluguel(precoAluguel, formaPagamento, dias);
        aluguel.processarPagamento();

        //mensagem final
        JOptionPane.showMessageDialog(this, "Aluguel realizado com sucesso!");
    }




    //pedindo os dados de compra do filme
    private void pedirDadosCompra() {
        try {

            //criando caixa p escolher o tipo de pagamento
            //opcoes dos tipos de pgto
            String[] tiposPagamento = {"À vista (R$5,00 de desconto", "Parcelado"};
            String tipo = (String) JOptionPane.showInputDialog(this,
                    "Como deseja pagar?", "Tipo de Pagamento",
                    //mostrando ícone com interrogação azul, indicando que o usuário precisa responder algo
                    JOptionPane.QUESTION_MESSAGE, null,
                    tiposPagamento, tiposPagamento[0]);

            //criando caixa p escolher a forma de pagamento
            String[] formasPagamento = {"Cartão", "Dinheiro", "Pix", "Boleto"};
            String formaPagamento = (String) JOptionPane.showInputDialog(this,
                    "Escolha a forma de pagamento:", "Forma de Pagamento",
                    //mostrando ícone com interrogação azul, indicando que o usuário precisa responder algo
                    JOptionPane.QUESTION_MESSAGE, null,
                    formasPagamento, formasPagamento[0]);


            boolean isAVista = tipo.equals("À vista (R$5,00 de desconto");
            boolean isParcelado = tipo.equals("Parcelado");
            double desconto = isAVista ? 5.00 : 0.0;
            int parcelas = 0;

            if (isParcelado) {
                String parcelasStr = JOptionPane.showInputDialog(this, "Número de parcelas:");
                if (parcelasStr == null) return;
                parcelas = Integer.parseInt(parcelasStr);
                if (parcelas <= 0) {
                    JOptionPane.showMessageDialog(this, "Número de parcelas inválido.");
                    return;
                }
            }

            Compra compra = new Compra(
                    precoCompra,
                    formaPagamento,
                    tipo,
                    isAVista,
                    desconto,
                    isParcelado,
                    parcelas
            );

            compra.processarPagamento();

            JOptionPane.showMessageDialog(this, "Compra realizada com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida. Tente novamente.");
        }
    }





    public TelaSeries() {
        setTitle("Catálogo de Séries");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        listaModel = new DefaultListModel<>();
        listaSeries = new JList<>(listaModel);
        JScrollPane scroll = new JScrollPane(listaSeries);

        add(scroll, BorderLayout.CENTER);


        JPanel painelBotoes = new JPanel();
        //flowlayout: coloca os botoes lado a lado
        painelBotoes.setLayout(new FlowLayout());

        btnComprar = new JButton("Comprar");
        btnAlugar = new JButton("Alugar");

        painelBotoes.add(btnAlugar);
        painelBotoes.add(btnComprar);

        //adicionando os botoes na parte de baixo da tela
        add(painelBotoes, BorderLayout.SOUTH);

        FileManager fileManager = new FileManager("./database/Serie.csv");
        filmes = fileManager.carregarFilmes();

        for (Filme f : filmes) {
            listaModel.addElement(f.getTitulo());
        }

        listaSeries.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int index = listaSeries.getSelectedIndex();
                if (index >= 0) {
                    Filme selecionado = filmes.get(index);
                    JOptionPane.showMessageDialog(this, selecionado.toString(), "Detalhes da Série", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnAlugar.addActionListener(e -> {
            int index = listaSeries.getSelectedIndex();
            if (index >= 0) {
                pedirDadosAluguel();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma série para alugar.");
            }
        });


        btnComprar.addActionListener(e -> {
            int index = listaSeries.getSelectedIndex();
            if (index >= 0) {
                Filme selecionado = filmes.get(index);
                if (selecionado.isDisponivelParaCompra()) {
                    pedirDadosCompra();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Esta série não está disponível para compra.",
                            "Compra", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Selecione uma série para comprar.",
                        "Compra", JOptionPane.WARNING_MESSAGE);
            }
        });


        JButton btnVoltar = new JButton("Voltar");

        btnVoltar.addActionListener(e -> {

            this.dispose();

            new TelaHome();
        });


        painelBotoes.add(btnVoltar);

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/Simbolo.png"));
        setIconImage(icon.getImage());


        setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(TelaSeries::new);
    }
}

