import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Onboarding extends JFrame {
    private JLabel imagemLabel;
    private JButton proximoBtn;
    private Usuario usuario;


    private String[] imagens = {
            "TOUR 9.png",
            "TOUR 11.png",
            "TOUR 15.png"
    };

    private int indice = 0;


    //disclaimer:

    public Onboarding() {
        setTitle("CineFilés");
        setSize(350, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        imagemLabel = new JLabel();
        imagemLabel.setHorizontalAlignment(SwingConstants.CENTER);
        atualizarImagem();

        proximoBtn = new JButton("Próximo");
        proximoBtn.addActionListener(e -> avancar());

        add(imagemLabel, BorderLayout.CENTER);
        add(proximoBtn, BorderLayout.SOUTH);


        ImageIcon icon = new ImageIcon(getClass().getResource("./resources/Simbolo.png"));
        setIconImage(icon.getImage());

        setVisible(true);
    }

    public Onboarding(Usuario usuario) {
        this(); // chama o construtor padrão que monta a interface
        this.usuario = usuario;

    }


    private void avancar() {
        indice++;
        if (indice < imagens.length) {
            atualizarImagem();
            if (indice == imagens.length - 1) {
                proximoBtn.setText("Começar");
            }
        } else {
            new TelaHome();
            dispose();
        }
    }

    private void atualizarImagem() {
        ImageIcon icon = new ImageIcon(imagens[indice]);
        Image img = icon.getImage().getScaledInstance(305, 662, Image.SCALE_SMOOTH);
        imagemLabel.setIcon(new ImageIcon(img));
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(Onboarding::new);

    }


}
