
package MultiHilos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin Fuentes
 */
public class Reloj extends javax.swing.JFrame {

    HiloDisplay display; 
    
    public Reloj() {
        initComponents();
        display = new HiloDisplay(this);    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbReloj = new javax.swing.JTabbedPane();
        pnlDigital = new javax.swing.JPanel();
        lbDigital = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnstart = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDigital.setFont(new java.awt.Font("Menlo", 1, 36)); // NOI18N
        lbDigital.setText("12:00:00");

        javax.swing.GroupLayout pnlDigitalLayout = new javax.swing.GroupLayout(pnlDigital);
        pnlDigital.setLayout(pnlDigitalLayout);
        pnlDigitalLayout.setHorizontalGroup(
            pnlDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDigitalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbDigital)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlDigitalLayout.setVerticalGroup(
            pnlDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDigitalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbDigital, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        tbReloj.addTab("Digital", pnlDigital);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        tbReloj.addTab("Analogico", jPanel2);

        btnstart.setText("Iniciar");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        btnstop.setText("Detener");
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tbReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnstart)
                        .addGap(27, 27, 27)
                        .addComponent(btnstop)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tbReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstart)
                    .addComponent(btnstop))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        // TODO add your handling code here:
        if (this.display.isAlive()){
            this.display.continuar();
        } else {
            this.display.start();
        }
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
            this.display.pausar();
    }//GEN-LAST:event_btnstopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reloj reloj = new Reloj();
                reloj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnstop;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbDigital;
    private javax.swing.JPanel pnlDigital;
    private javax.swing.JTabbedPane tbReloj;
    // End of variables declaration//GEN-END:variables

}

class HiloDisplay extends Thread {
    SimpleDateFormat formatter;  
    Date date;
    Reloj reloj;
    
    private volatile boolean running = true;
    private volatile boolean paused = false;
    private final Object pauseLock = new Object();
    
    HiloDisplay(Reloj _reloj){
        this.reloj = _reloj;
        this.formatter = new SimpleDateFormat("HH:mm:ss");  
        this.date = new Date();         
    }
    
    @Override
    public void run() {
        while (running) {
            synchronized (pauseLock) {
                if (!running) { // may have changed while waiting to
                    // synchronize on pauseLock
                    break;
                }
                if (paused) {
                    try {
                        pauseLock.wait(); 
                        // will cause this Thread to block until 
                        // another thread calls pauseLock.notifyAll()
                        // Note that calling wait() will 
                        // relinquish the synchronized lock that this 
                        // thread holds on pauseLock so another thread
                        // can acquire the lock to call notifyAll()
                        // (link with explanation below this code)
                    } catch (InterruptedException ex) {
                        break;
                    }
                    if (!running) { // 
                        break;
                    }
                }
            }
            this.date = new Date();
            this.reloj.lbDigital.setText(this.formatter.format(this.date));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }           
    }
    
    public void detener() {
        running = false;

        continuar();

    }

    public void pausar() {
        // you may want to throw an IllegalStateException if !running
        paused = true;
    }

    public void continuar() {
        synchronized (pauseLock) {
            paused = false;
            pauseLock.notifyAll(); // Desbloquea el hilo
        }
    }
}
