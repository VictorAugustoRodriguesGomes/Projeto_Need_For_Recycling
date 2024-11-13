package gamer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.ImageIcon;
import need.pkgfor.recycling.NeedForRecycling;

public class Menu extends javax.swing.JFrame {

    URL somu;
    AudioClip Somu;

    URL somy;
    AudioClip Somy;

    public Menu() {
        initComponents();

        setSize(830, 660);
        setLocationRelativeTo(null);

        MusicaFundo();
    }

    public void MusicaFundo() {
        somu = NeedForRecycling.class.getResource("x.wav");
        Somu = Applet.newAudioClip(somu);
        Somu.loop();
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Need For Recycling");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Credits");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 450, 133, 40);

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Leave Game");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(340, 520, 133, 40);

        jButton4.setBackground(new java.awt.Color(0, 204, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("See Controls");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(340, 380, 133, 40);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("New Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 310, 133, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/MenuFundo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(13, 14, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Somu.stop();
        MusicaBTN();
        Introducao introducao = new Introducao();
        introducao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Somu.stop();
        MusicaBTN();
        Credits credits = new Credits();
        credits.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Somu.stop();
        MusicaBTN();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Somu.stop();
        MusicaBTN();
        SeeControls seeControls = new SeeControls();
        seeControls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
