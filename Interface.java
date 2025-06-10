import javax.swing.*;

//essa é a classe base p trocar as telas
public abstract class Interface {
    private static final JFrame frame = new JFrame("Netflix 2.0");

    //funcao abrir a janela
    public static void abrirPanel(JPanel panel){
        frame.add(panel);

        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //funcao trocar de janelas
    public void trocarPanel(JPanel panel){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();
    }

    public abstract JPanel mostrar();
}