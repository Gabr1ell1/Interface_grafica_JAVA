package cordefundo;
import javax.swing.*;
import java.awt.*; //a classe Container está nele

public class CorDeFundo extends JFrame
{
     public CorDeFundo()
        {
            super("Definindo cor de fundo");
            Container tela = getContentPane(); //criando um container e instanciando   
            tela.setBackground(Color.blue);//escolhendo a cor de fundo
            setSize(500, 100);//largura e altura
            setVisible(true);//exibindo a janela, chamando o método serVisible
        }
  
    public static void main(String[] args) {
        CorDeFundo app = new CorDeFundo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
