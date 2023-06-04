
package Metodo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
        
    }
    JButton jBtn1;
    public MiFrame(){
        this.setSize(320, 200);
        jBtn1 = new JButton("Salir");
        jBtn1.addActionListener(this);
        this.add(jBtn1); 
    }
    
    public static void main(String[] args) {
        MiFrame frame  = new MiFrame();
        
        frame.setVisible(true);
    }

     
}

