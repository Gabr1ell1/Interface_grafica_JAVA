package janela;
import java.awt.*;
import javax.swing.*;


public class Janela extends JFrame{
    public Janela(){
            Container tela = getContentPane(); //criando um container e instanciando   
            tela.setBackground(Color.blue);//escolhendo a cor de fundo
            setSize(300, 150); // largura e altura.
            setLocationRelativeTo(null);//centralizando a janela.
            setResizable(false);//desabilita a capacidade de redimensionamento da janela.
            setVisible(true); //exibindo a janela chamando o método setVisible.
            
            //adicionando um icone a janela
            ImageIcon icone = new ImageIcon("teste.png");
            setIconImage(icone.getImage());
    }
    public static void main(String[] args) {
        Janela app = new Janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
