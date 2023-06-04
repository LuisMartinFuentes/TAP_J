
package Metodo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame{
    JButton jBtn1;
    public MiFrame(){
        
        this.setSize(320, 200);
        jBtn1 = new JButton("Salir");
        this.add(jBtn1);
        
        jBtn1.addActionListener(
                new ActionListener(){
                    
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
                    
                }
        );
        
    }
    
    public static void main(String[] args) {
        
        MiFrame frame = new MiFrame();
         
        frame.setVisible(true);
    }
    
}
