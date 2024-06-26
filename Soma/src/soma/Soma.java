package soma;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        public class Soma extends JFrame{ 
            JLabel rotulo1, rotulo2, exibir;
            JTextField texto1,texto2; 
            JButton somar;
            
            public Soma(){ 
                super("Exemplo de soma");
                Container tela = getContentPane();
                setLayout(null);

                rotulo1 = new JLabel("1° Número: ");
                rotulo2 = new JLabel("2° Número: ");

                texto1 = new JTextField(5);
                texto2 = new JTextField(5);

                exibir = new JLabel(""); //Cria um rótulo vazio, que será usado para exibir o resultado depois
                somar = new JButton("Somar");

                rotulo1.setBounds(50,20,100,20); 
                rotulo2.setBounds(50,60,100,20); 
                texto1.setBounds(120,20,200,20); 
                texto2.setBounds(120,60,200,20); 
                exibir.setBounds(50,120,200,20); 
                somar.setBounds(150,100,80,20);

                somar.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){// Método chamado quando o botão é clicado
                    int numero1, numero2, soma; 
                      soma=0; 
                        numero1 = Integer.parseInt(texto1.getText()); //converte os valores digitados em inteiros
                        numero2 = Integer.parseInt(texto2.getText()); //converte os valores digitados em inteiros
                       
                        soma = numero1 + numero2;
                        exibir.setVisible(true); //torna rótulo exibir visível
                        exibir.setText("A soma é: "+soma); // Define o rótulo exibir como a mensagem "A soma é: +soma" 
            }
        }
    );exibir.setVisible(false);
        tela.add(rotulo1); 
        tela.add(rotulo2);

        tela.add(texto1); 
        tela.add(texto2);
        
        tela.add(exibir);
        tela.add(somar);
        
        setSize(400,250);
        setVisible(true);
            }
            public static void main(String []args){
                Soma app = new Soma();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
        }