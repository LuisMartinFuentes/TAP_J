
package Practicas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Practica1 {
    
    public static void main(String[] args) {
        
        Practica1 pract = new Practica1();
        
        pract.run();
        
    }
     
    public void run(){
        
        JFrame frame = new JFrame("Saludador");
        frame.setSize(600, 400);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lbl = new JLabel("Escribe un nombre para saludar");
        JTextField txt = new JTextField();
        JButton btnS = new JButton("Saludar");
        
        
        btnS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hola "+txt.getText()+"!!!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
            }   
        });
        
        
        frame.add(lbl, BorderLayout.PAGE_START);
        frame.add(txt, BorderLayout.CENTER);
        frame.add(btnS, BorderLayout.PAGE_END);
        
        //frame.pack();
        frame.setVisible(true);
        
    }
}