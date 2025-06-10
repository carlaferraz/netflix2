import javax.swing.*;

public class Home extends Interface{

    @Override
    public JPanel mostrar(){
        JPanel panel = new JPanel();

        JButton buttonFilme = new JButton("Filmes");
        buttonFilme.addActionListener(e -> trocarPanel(new FilePanel("./database/Filme.csv").mostrar()));

        JButton buttonSerie = new JButton("Séries");
        buttonSerie.addActionListener(e -> trocarPanel(new FilePanel("./database/Serie.csv").mostrar()));

        JButton buttonOi = new JButton("Duvido Clicar");
        buttonOi.addActionListener(event -> {
            String nome = JOptionPane.showInputDialog("Qual o seu nome?");
            JOptionPane.showMessageDialog(null, "Oiii, " + nome);
        });

        panel.add(buttonFilme);
        panel.add(buttonSerie);
        panel.add(buttonOi);

        return panel;
    }
}