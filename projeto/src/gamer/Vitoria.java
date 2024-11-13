package gamer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.ImageIcon;
import need.pkgfor.recycling.NeedForRecycling;

public class Vitoria extends javax.swing.JFrame {

    int pp1;
    int pp2;

    URL somu;
    AudioClip Somu;

    public Vitoria(int pontos1, int pontos2) {
        initComponents();

        setSize(830, 660);
        setLocationRelativeTo(null);

        this.pp1 = pontos1;
        this.pp2 = pontos2;

        mp1.setText("" + pp1 + " PONTOS");
        mp2.setText("" + pp2 + " PONTOS");

        if (pp1 > pp2) {
            mv.setIcon(new ImageIcon("src/VP/VP1.png"));
        }
        if (pp2 > pp1) {
            mv.setIcon(new ImageIcon("src/VP/VP2.png"));
        }
        if (pp1 == pp2) {
            mv.setIcon(new ImageIcon("src/VP/VP3.png"));
        }
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
        mv = new javax.swing.JLabel();
        mp1 = new javax.swing.JLabel();
        mp2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Need For Recycling");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
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
        jButton2.setBounds(20, 560, 180, 40);

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Play Again");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(623, 560, 180, 40);
        jPanel1.add(mv);
        mv.setBounds(340, 260, 170, 100);

        mp1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(mp1);
        mp1.setBounds(70, 270, 200, 40);

        mp2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(mp2);
        mp2.setBounds(610, 270, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/TV1.png"))); // NOI18N
        jLabel1.setText("\n");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 13, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 824, 626);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MusicaBTN();
        Introducao introducao = new Introducao();
        introducao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MusicaBTN();
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mp1;
    private javax.swing.JLabel mp2;
    private javax.swing.JLabel mv;
    // End of variables declaration//GEN-END:variables
}
