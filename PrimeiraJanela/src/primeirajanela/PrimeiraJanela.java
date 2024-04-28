package primeirajanela;
import javax.swing.*;
/*classe JFrame: Essa classe fornece todas as propriedades, métodos
e eventos que precisamos para construir janela*/

        public class PrimeiraJanela extends JFrame{
            public PrimeiraJanela(){
                super("Primeira Janela"); //titulo da janela
                setSize(300, 150); // largura (comprimento) e altura
                setVisible(true); //exibimos a janela efetuando uma chamada ao método setVisible
    
}
    public static void main(String[] args) 
{
      PrimeiraJanela app = new PrimeiraJanela(); 
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*EXIT_ON_CLOSE, que é uma das constantes da classe JFrame que define
        como o aplicativo vai se comportar quando o usuário tentar fechar a janela*/
      
}
    
}
