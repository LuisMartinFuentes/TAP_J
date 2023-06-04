package Metodo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame{
    
    JButton Button;
    
        MiFrame(){
        
        this.setSize(320, 200);
        Button = new JButton("Salir");
        MiListener listener = new MiListener();
        Button.addActionListener(listener);
        this.add(Button); 
        
    }
     public static void main(String[] args) {
        MiFrame frame = new MiFrame();
        
        frame.setVisible(true);
    }
}
 