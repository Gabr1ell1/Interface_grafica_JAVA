package jlabeljtext;
import javax.swing.*;
import java.awt.*;

public class JlabelJtext extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4; //declaração das variaveis tipo JLabel que serão exibidos na janela
    JTextField texto1, texto2, texto3, texto4;   
    public JlabelJtext(){
        super("Janela com os componetes Jlabel e Jtext");    
        Container tela = getContentPane();//contêiner principal da janela
        setLayout(null);// defini o layout do contêiner como nulo  
        
        //insere texto nos rotulos 
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        //defini as caixas de texto e a quantidade de caracteres 
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        
        
        //defini a posição dos rotulos
        //- coluna -linha - largura -comprimento 
        rotulo1.setBounds(50,30,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,60,100,100);
        rotulo4.setBounds(50,140,80,20);
        //defini a posição das caixas de texto
        //x y width height)
        texto1.setBounds(110,30,200,20);
        texto2.setBounds(110,60,20,20);
        texto3.setBounds(150,100,80,20);
        texto4.setBounds(120,140,120,20);
        
        
        //defini as cores dos rotulos
        rotulo1.setForeground(Color.RED);
        rotulo2.setForeground(Color.BLUE);
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        //defini as fontes dos rotulos
        rotulo1.setFont(new Font("Arial", Font.BOLD, 14));
        rotulo2.setFont(new Font("Comics Sans MS", Font.BOLD,16));
        rotulo3.setFont(new Font("Courier New", Font.BOLD,18));
        rotulo4.setFont(new Font("Times New Roman", Font.BOLD,20));
        
        
        //chamada dos método para exibir os rotulos e as caixas de texto
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        setSize(400, 250);//tamanho da janela
        setVisible(true);//exibi a janela
        setLocationRelativeTo(null);//centraliza a janela na tela
}
   
    public static void main(String[] args) 
    {
             JlabelJtext app = new JlabelJtext();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}