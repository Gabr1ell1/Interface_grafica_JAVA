package janelaicone;
import javax.swing.*;

public class JanelaIcone extends JFrame 
{
    public JanelaIcone(){
       super("Como definir o ícone para a janela");//titulo da janela
       ImageIcon icone = new ImageIcon("teste.png");
       setIconImage(icone.getImage());
       setSize(200, 150);
       setVisible(true);
    }
    public static void main(String[] args) {
        JanelaIcone app = new JanelaIcone();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
