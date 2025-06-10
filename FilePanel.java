import javax.swing.*;

public class FilePanel extends Interface{
    private String caminhoArquivo;

    public FilePanel(String caminhoArquivo){
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public JPanel mostrar(){
        FileManager fm = new FileManager(caminhoArquivo);

        JPanel panel = new JPanel();

        //mudar por aqui provavelmente
        JButton verCatalogoFilmes = new JButton("Ver catálogo de filmes");
        verCatalogoFilmes.addActionListener(e -> fm.verCatalogoFilmes());

        JButton verCatalogoSeries = new JButton("Ver catálogo de séries");
        verCatalogoSeries.addActionListener(e -> fm.verCatalogoSeries());

        JButton sair = new JButton("Sair");
        sair.addActionListener(e -> trocarPanel(new Home().mostrar()));

        panel.add(verCatalogoFilmes);
        panel.add(verCatalogoSeries);
        panel.add(sair);

        return panel;
    }
}
