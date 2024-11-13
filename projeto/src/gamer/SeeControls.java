package gamer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import need.pkgfor.recycling.NeedForRecycling;

public class SeeControls extends javax.swing.JFrame {
    URL somu;
    AudioClip Somu;
    
    public SeeControls() {
        initComponents();
        
        setSize(830, 660);
        setLocationRelativeTo(null);
    }
    public void MusicaBTN() {
        somu = NeedForRecycling.class.getResource("y.wav");
        Somu = Applet.newAudioClip(somu);
        Somu.play();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Need For Recycling");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Back to Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(587, 551, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/TVC.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(13, 14, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -1, 826, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MusicaBTN();
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
