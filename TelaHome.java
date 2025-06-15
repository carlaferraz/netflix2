import javax.swing.*;
import java.awt.*;

    public class TelaHome extends JFrame {

        public TelaHome() {
            setTitle("Escolha o Catálogo");
            setSize(300, 150);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            JButton btnFilmes = new JButton("Catálogo de Filmes");
            JButton btnSeries = new JButton("Catálogo de Séries");

            add(btnFilmes);
            add(btnSeries);

            btnFilmes.addActionListener(e -> {

                new TelaFilmes();
                this.dispose();
            });

            btnSeries.addActionListener(e -> {

                new TelaSeries();
                this.dispose();
            });


            ImageIcon icon = new ImageIcon(getClass().getResource("/resources/Simbolo.png"));
            setIconImage(icon.getImage());


            setVisible(true);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(TelaHome::new);
        }
    }


