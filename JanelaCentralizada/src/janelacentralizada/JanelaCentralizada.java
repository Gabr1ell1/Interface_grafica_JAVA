package janelacentralizada;
import javax.swing.*;

   public class JanelaCentralizada extends JFrame{
        public JanelaCentralizada(){
            super("Janela Centralizada");//nome da janela
            setSize(300, 150); // largura e altura
            setVisible(true); //exibindo a janela chamando o método setVisible
            setLocationRelativeTo(null);//centralizando a janela
        }
            
        public static void main(String [] args){
            JanelaCentralizada app = new JanelaCentralizada();//instanciando JanelaCentralizada()
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* fechando a janela. EXIT_ON_CLOSE,é uma das constantes da classe JFrame que define
como o aplicativo vai se comportar quando o usuário tentar fechar a janela*/
        }
}
