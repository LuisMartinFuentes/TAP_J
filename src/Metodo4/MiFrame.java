package Metodo4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame{
    JButton jBtn1;
    public MiFrame(){
        
        this.setSize(320, 200);
        jBtn1 = new JButton("Salir");
        this.add(jBtn1);
        
        jBtn1.addMouseListener(
                new MouseListener(){
                    
            public void actionPerformed(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                 
            }

            @Override
            public void mousePressed(MouseEvent e) {               
            }

            @Override
            public void mouseReleased(MouseEvent e) {              
            }

            @Override
            public void mouseEntered(MouseEvent e) {               
            }

            @Override
            public void mouseExited(MouseEvent e) {               
            }
           
                }
        );
        
    }
    
    public static void main(String[] args) {
        
        MiFrame frame = new MiFrame();
         
        frame.setVisible(true);
    }
    
}
