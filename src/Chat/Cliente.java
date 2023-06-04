/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin Fuentes
 */
public class Cliente {
    
    BufferedReader in;
    PrintWriter    out;
    
    Socket cnx;
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Cliente()).start();
            }
        });
    }

    void start() {
        String respuesta="", comando = "";
        Conexion hilo;
        Scanner consola = new Scanner(System.in);
        try {
            this.cnx = new Socket("127.0.0.1",3000);
            
            in = new BufferedReader(new InputStreamReader(cnx.getInputStream()));
            out = new PrintWriter(cnx.getOutputStream(),true);
            
            hilo = new Conexion(in);
            hilo.start(); //Hilo encargado de lecturas del servidor

            while (!comando.toLowerCase().contains("salir")){   
                 comando = consola.nextLine();
                 out.println(comando);                
            }
            
            hilo.ejecutar = false;
            Thread.sleep(2000);
            
            this.cnx.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    class Conexion extends Thread {
        public boolean ejecutar = true;
        BufferedReader in;
        
        public Conexion(BufferedReader in){
            this.in = in;
        }
        
        @Override
        public void run() {
            String respuesta = "";
            while(ejecutar){
                try {            
                    respuesta = in.readLine();
                    if (respuesta!=null) System.out.println(respuesta); 
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        }   
    }
    
}
