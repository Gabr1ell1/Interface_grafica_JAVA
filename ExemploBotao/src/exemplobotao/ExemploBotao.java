package exemplobotao;
import javax.swing.*;
//importa as classes relacionadas a eventos na janela
import java.awt.*;
import java.awt.event.*;

public class ExemploBotao extends JFrame {
        JButton botaosair;

    public ExemploBotao(){
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);

        botaosair = new JButton ("Sair");
        botaosair.setBounds(100,50,100,20);
        
        botaosair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){//método chamado quando clicado no botão
                System.exit(0);//fechando a janela
        }
    }
);

    tela.add(botaosair);
    setSize(300, 150);
    setVisible(true);
}
    public static void main(String[] args) {
        ExemploBotao app = new ExemploBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
        
