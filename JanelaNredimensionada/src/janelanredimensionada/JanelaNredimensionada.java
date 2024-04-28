package janelanredimensionada;
import javax.swing.*;

public class JanelaNredimensionada extends JFrame {
    public JanelaNredimensionada(){
        super("Uma janela não redimensionada");//titulo da janela
        setResizable(false);
        setSize(150, 300);//largura e altura
        setVisible(true);//exibindoa a janela chamando o método setVisible
    }
   
    public static void main(String[] args) {
        JanelaNredimensionada app = new JanelaNredimensionada(); //instanciando a classe JanelaNredimensionada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*EXIT_ON_CLOSE, que é uma das constantes da classe JFrame que define
como o aplicativo vai se comportar quando o usuário tentar fechar a janela*/
    }
    
}
