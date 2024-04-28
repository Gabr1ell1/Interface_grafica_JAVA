package senhadigitada;
import javax.swing.*;
// Importa as classes relacionadas a eventos de interface.
import java.awt.*;
import java.awt.event.*;

public class SenhaDigitada extends JFrame{
    JPasswordField caixa; //declaração de uma variavel como JPasswordField, os caracteres digitados serão ocultados.
    JLabel rotulo, exibir; //declaração de duas variaveis como JLabel, exibição de texto não editavel. 
    JButton mostrar; //declaração de uma variavel como JButton, um botão. 

        public SenhaDigitada(){ 
            
        super("Exemplo com JPasswordField");//titulo da janela.
        Container tela = getContentPane();// contêiner principal da janela, onde será adicionado os componentes.
        setLayout(null); rotulo = new JLabel("Senha: ");//os componentes serão posicionados manualmente

        caixa = new JPasswordField(10);
        exibir = new JLabel("A senha digitada é: ");
        mostrar = new JButton("Mostrar");
        exibir.setVisible(false); 
        
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,200,20); 
        exibir.setBounds(50,120,200,20); 
        mostrar.setBounds(150,100,80,20);

        mostrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){// Método chamado quando o botão é clicado.
            String senha = new String(caixa.getPassword());// Obtém a senha digitada no campo de senha.
            exibir.setVisible(true); // Define o texto do rótulo exibir, como a senha digitada.
            exibir.setText(senha);
        }
    }
); 
        tela.add(rotulo);
        tela.add(caixa);
        tela.add(exibir); 
        tela.add(mostrar); 
        setSize(400, 250); 
        setVisible(true);
}
        public static void main(String args[]){
            SenhaDigitada app = new SenhaDigitada();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}