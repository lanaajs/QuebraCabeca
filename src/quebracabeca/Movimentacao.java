package quebracabeca;

import javax.swing.JButton;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static quebracabeca.Design.milisegundo;
import static quebracabeca.Design.segundo;
import static quebracabeca.Design.minuto;
import static quebracabeca.Design.hora;
import static quebracabeca.Design.contagem;


//@author Alana de Jesus, João Marcelo e Raissa Vieira

public class Movimentacao extends javax.swing.JFrame
{    
    
    public void mover (JButton pp, JButton p1, JButton p2) 
    {
        if (p1.getText().equals(""))
        {                
            p1.setText(pp.getText());
            pp.setText("");
        }else if (p2.getText().equals(""))
        { 
            p2.setText(pp.getText());
            pp.setText("");
        }
    }
    
   
    
    public void mover (JButton pp, JButton p1, JButton p2, JButton p3, JButton p4) 
    {
        if (p1.getText().equals(""))
        {                
            p1.setText(pp.getText());
            pp.setText("");
        }else if (p2.getText().equals(""))
        { 
            p2.setText(pp.getText());
            pp.setText("");
        }else if (p3.getText().equals(""))
        {
            p3.setText(pp.getText());
            pp.setText("");
        }else if (p4.getText().equals(""))
        {
            p4.setText(pp.getText());
            pp.setText("");
        }
    }
    
    
    
     public void mover (JButton pp, JButton p1, JButton p2, JButton p3) 
    {
        if (p1.getText().equals(""))
        {                
            p1.setText(pp.getText());
            pp.setText("");
        }else if (p2.getText().equals(""))
        { 
            p2.setText(pp.getText());
            pp.setText("");
        }else if (p3.getText().equals(""))
        {
            p3.setText(pp.getText());
            pp.setText("");
        }
    }
    
     
     
    public void condicao(List<String> lista, JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9, JButton b10, JButton b11, JButton b12, JButton b13, JButton b14, JButton b15, JButton b16, JLabel Milisegundo, JLabel Segundo, JLabel Minuto, JLabel Hora, JLabel Pontos) 
    {
        List<String> verif= Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","");
       
        if(verif.equals(lista))
        {
            String ML= Integer.toString(milisegundo);
            String SEG= Integer.toString(segundo);
            String MIN= Integer.toString(minuto);
            String HR= Integer.toString(hora);
            
            String RES=(HR+": "+MIN+": "+SEG+": "+ML);
  
            if (JOptionPane.showConfirmDialog(null, "VOCÊ GANHOU!!\nSeu tempo foi: "+RES+"\nDeseja jogar novamente?", "Resposta", 1) == 0)
            {
               
               Collections.shuffle(lista); 
               
                b1.setText(lista.get(0));
                b2.setText(lista.get(1));
                b3.setText(lista.get(2));
                b4.setText(lista.get(3));
                b5.setText(lista.get(4));
                b6.setText(lista.get(5));
                b7.setText(lista.get(6));
                b8.setText(lista.get(7));
                b9.setText(lista.get(8));
                b10.setText(lista.get(9));
                b11.setText(lista.get(10));
                b12.setText(lista.get(11));
                b13.setText(lista.get(12));
                b14.setText(lista.get(13));
                b15.setText(lista.get(14));
                b16.setText(lista.get(15));
                
                milisegundo=0;
                segundo=0;
                minuto=0;
                hora=0;
                contagem=0;
   
                Milisegundo.setText("00");
                Segundo.setText("00:");
                Minuto.setText("00:");
                Hora.setText("00:");
                Pontos.setText("0");
            }
            
            else
            {
               System.exit(0); 
            } 
            
        }
        
    }


    
    public void conta(JLabel Pontos, int contagem)
    {
        String c= Integer.toString(contagem);
        
        if(contagem>=1)
        {
            Pontos.setText(c);
            
        }
    }
    

    
}