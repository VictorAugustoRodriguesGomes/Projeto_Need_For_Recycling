package gamer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import need.pkgfor.recycling.NeedForRecycling;

public class Gamer extends javax.swing.JFrame {

    int larguraPersonagemPer1 = 0;
    int alturaPersonagemPer1 = 0;

    int larguraPersonagemPer2 = 0;
    int alturaPersonagemPer2 = 0;

    int animacaoPer1 = 2;
    int animacaoPer2 = 3;
    int animacaolixo = 2;

    int qlixo = 28;
    int clixo = 0;

    int tempo = 100;

    int pontosPer1 = 0;
    int pontosPer2 = 0;

    URL somu;
    AudioClip Somu;

    URL somx;
    AudioClip Somx;

    URL somz;
    AudioClip Somz;

    public Gamer() {
        initComponents();

        setSize(830, 760);
        setLocationRelativeTo(null);

        MusicaFundo();

        Controle1();
        Controle2();

        new ContarTempo().start();

        tp1.setText("0 PONTOS");
        tp2.setText("0 PONTOS");

        larguraPersonagemPer1 = per1.getLocation().x;
        alturaPersonagemPer1 = per1.getLocation().y;

        larguraPersonagemPer2 = per2.getLocation().x;
        alturaPersonagemPer2 = per2.getLocation().y;
    }

    public void Controle1() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                ColisaoPer1(per1, lixo1, lixo2, lixo3, lixo4, lixo5, lixo6, lixo7, lixo8, lixo9, lixo10, lixo11, lixo12, lixo13, lixo14,
                        lixo15, lixo16, lixo17, lixo18, lixo19, lixo20, lixo21, lixo22, lixo23, lixo24, lixo25, lixo26, lixo27, lixo28);

                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    alturaPersonagemPer1 = per1.getLocation().y - 10;
                    if (alturaPersonagemPer1 <= 110) {
                    } else {
                        if (animacaoPer1 > 3) {
                            animacaoPer1 = 1;
                        }
                        if (animacaoPer1 == 1) {
                            per1.setIcon(new ImageIcon("src/per1/per1w" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 2) {
                            per1.setIcon(new ImageIcon("src/per1/per1w" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 3) {
                            per1.setIcon(new ImageIcon("src/per1/per1w" + animacaoPer1 + ".png"));
                        }

                        animacaoPer1 = animacaoPer1 + 1;

                        per1.setLocation(per1.getLocation().x, alturaPersonagemPer1);
                    }
                }
                if (ke.getKeyCode() == KeyEvent.VK_D) {
                    larguraPersonagemPer1 = 10 + per1.getLocation().x;
                    if (larguraPersonagemPer1 >= 785) {
                    } else {
                        if (animacaoPer1 > 3) {
                            animacaoPer1 = 1;
                        }
                        if (animacaoPer1 == 1) {
                            per1.setIcon(new ImageIcon("src/per1/per1d" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 2) {
                            per1.setIcon(new ImageIcon("src/per1/per1d" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 3) {
                            per1.setIcon(new ImageIcon("src/per1/per1d" + animacaoPer1 + ".png"));
                        }

                        animacaoPer1 = animacaoPer1 + 1;

                        per1.setLocation(larguraPersonagemPer1, per1.getLocation().y);
                    }
                }
                if (ke.getKeyCode() == KeyEvent.VK_S) {
                    alturaPersonagemPer1 = 10 + per1.getLocation().y;
                    if (alturaPersonagemPer1 >= 675) {
                    } else {
                        if (animacaoPer1 > 3) {
                            animacaoPer1 = 1;
                        }
                        if (animacaoPer1 == 1) {
                            per1.setIcon(new ImageIcon("src/per1/per1s" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 2) {
                            per1.setIcon(new ImageIcon("src/per1/per1s" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 3) {
                            per1.setIcon(new ImageIcon("src/per1/per1s" + animacaoPer1 + ".png"));
                        }

                        animacaoPer1 = animacaoPer1 + 1;
                        per1.setLocation(per1.getLocation().x, alturaPersonagemPer1);
                    }
                }
                if (ke.getKeyCode() == KeyEvent.VK_A) {
                    larguraPersonagemPer1 = per1.getLocation().x - 10;
                    if (larguraPersonagemPer1 <= 10) {
                    } else {
                        if (animacaoPer1 > 3) {
                            animacaoPer1 = 1;
                        }
                        if (animacaoPer1 == 1) {
                            per1.setIcon(new ImageIcon("src/per1/per1a" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 2) {
                            per1.setIcon(new ImageIcon("src/per1/per1a" + animacaoPer1 + ".png"));
                        }
                        if (animacaoPer1 == 3) {
                            per1.setIcon(new ImageIcon("src/per1/per1a" + animacaoPer1 + ".png"));
                        }

                        animacaoPer1 = animacaoPer1 + 1;
                        per1.setLocation(larguraPersonagemPer1, per1.getLocation().y);
                    }
                }

                if (qlixo < 15) {
                    for (int i = 0; i < 6; i++) {

                        Random random = new Random();
                        clixo = random.nextInt(28);

                        if (clixo == 1) {
                            lixo1.setSize(18, 22);
                        }
                        if (clixo == 2) {
                            lixo2.setSize(18, 22);
                        }
                        if (clixo == 3) {
                            lixo3.setSize(18, 22);
                        }
                        if (clixo == 4) {
                            lixo4.setSize(18, 22);
                        }
                        if (clixo == 15) {
                            lixo5.setSize(18, 22);
                        }
                        if (clixo == 6) {
                            lixo6.setSize(18, 22);
                        }
                        if (clixo == 7) {
                            lixo7.setSize(18, 22);
                        }
                        if (clixo == 8) {
                            lixo8.setSize(18, 22);
                        }
                        if (clixo == 9) {
                            lixo9.setSize(18, 22);
                        }
                        if (clixo == 10) {
                            lixo10.setSize(18, 22);
                        }
                        if (clixo == 11) {
                            lixo11.setSize(18, 22);
                        }
                        if (clixo == 12) {
                            lixo12.setSize(18, 22);
                        }
                        if (clixo == 13) {
                            lixo13.setSize(18, 22);
                        }
                        if (clixo == 14) {
                            lixo14.setSize(18, 22);
                        }
                        if (clixo == 15) {
                            lixo15.setSize(18, 22);
                        }
                        if (clixo == 16) {
                            lixo16.setSize(18, 22);
                        }
                        if (clixo == 17) {
                            lixo17.setSize(18, 22);
                        }
                        if (clixo == 18) {
                            lixo18.setSize(18, 22);
                        }
                        if (clixo == 19) {
                            lixo19.setSize(18, 22);
                        }
                        if (clixo == 20) {
                            lixo20.setSize(18, 22);
                        }
                        if (clixo == 21) {
                            lixo21.setSize(18, 22);
                        }
                        if (clixo == 22) {
                            lixo22.setSize(18, 22);
                        }
                        if (clixo == 23) {
                            lixo23.setSize(18, 22);
                        }
                        if (clixo == 24) {
                            lixo24.setSize(18, 22);
                        }
                        if (clixo == 25) {
                            lixo25.setSize(18, 22);
                        }
                        if (clixo == 26) {
                            lixo26.setSize(18, 22);
                        }
                        if (clixo == 27) {
                            lixo27.setSize(18, 22);
                        }
                        if (clixo == 28) {
                            lixo28.setSize(18, 22);
                        }
                    }
                    qlixo = qlixo + 2;
                }

            }
        });
    }

    public void Controle2() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                ColisaoPer2(per2, lixo1, lixo2, lixo3, lixo4, lixo5, lixo6, lixo7, lixo8, lixo9, lixo10, lixo11, lixo12, lixo13, lixo14,
                        lixo15, lixo16, lixo17, lixo18, lixo19, lixo20, lixo21, lixo22, lixo23, lixo24, lixo25, lixo26, lixo27, lixo28);

                if (ke.getKeyCode() == KeyEvent.VK_UP) {
                    alturaPersonagemPer2 = per2.getLocation().y - 10;
                    if (alturaPersonagemPer2 <= 110) {
                    } else {
                        if (animacaoPer2 > 3) {
                            animacaoPer2 = 1;
                        }
                        if (animacaoPer2 == 1) {
                            per2.setIcon(new ImageIcon("src/per2/per2w" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 2) {
                            per2.setIcon(new ImageIcon("src/per2/per2w" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 3) {
                            per2.setIcon(new ImageIcon("src/per2/per2w" + animacaoPer2 + ".png"));
                        }

                        animacaoPer2 = animacaoPer2 + 1;

                        per2.setLocation(per2.getLocation().x, alturaPersonagemPer2);
                    }
                }
                if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                    larguraPersonagemPer2 = 10 + per2.getLocation().x;
                    if (larguraPersonagemPer2 >= 785) {
                    } else {
                        if (animacaoPer2 > 3) {
                            animacaoPer2 = 1;
                        }
                        if (animacaoPer2 == 1) {
                            per2.setIcon(new ImageIcon("src/per2/per2d" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 2) {
                            per2.setIcon(new ImageIcon("src/per2/per2d" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 3) {
                            per2.setIcon(new ImageIcon("src/per2/per2d" + animacaoPer2 + ".png"));
                        }

                        animacaoPer2 = animacaoPer2 + 1;

                        per2.setLocation(larguraPersonagemPer2, per2.getLocation().y);
                    }
                }
                if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                    alturaPersonagemPer2 = 10 + per2.getLocation().y;
                    if (alturaPersonagemPer2 >= 675) {
                    } else {
                        if (animacaoPer2 > 3) {
                            animacaoPer2 = 1;
                        }
                        if (animacaoPer2 == 1) {
                            per2.setIcon(new ImageIcon("src/per2/per2s" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 2) {
                            per2.setIcon(new ImageIcon("src/per2/per2s" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 3) {
                            per2.setIcon(new ImageIcon("src/per2/per2s" + animacaoPer2 + ".png"));
                        }

                        animacaoPer2 = animacaoPer2 + 1;
                        per2.setLocation(per2.getLocation().x, alturaPersonagemPer2);
                    }
                }
                if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    larguraPersonagemPer2 = per2.getLocation().x - 10;
                    if (larguraPersonagemPer2 <= 10) {
                    } else {
                        if (animacaoPer2 > 3) {
                            animacaoPer2 = 1;
                        }
                        if (animacaoPer2 == 1) {
                            per2.setIcon(new ImageIcon("src/per2/per2a" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 2) {
                            per2.setIcon(new ImageIcon("src/per2/per2a" + animacaoPer2 + ".png"));
                        }
                        if (animacaoPer2 == 3) {
                            per2.setIcon(new ImageIcon("src/per2/per2a" + animacaoPer2 + ".png"));
                        }

                        animacaoPer2 = animacaoPer2 + 1;
                        per2.setLocation(larguraPersonagemPer2, per2.getLocation().y);
                    }
                    if (qlixo < 15) {
                        for (int i = 0; i < 6; i++) {

                            Random random = new Random();
                            clixo = random.nextInt(28);

                            if (clixo == 1) {
                                lixo1.setSize(18, 22);
                            }
                            if (clixo == 2) {
                                lixo2.setSize(18, 22);
                            }
                            if (clixo == 3) {
                                lixo3.setSize(18, 22);
                            }
                            if (clixo == 4) {
                                lixo4.setSize(18, 22);
                            }
                            if (clixo == 15) {
                                lixo5.setSize(18, 22);
                            }
                            if (clixo == 6) {
                                lixo6.setSize(18, 22);
                            }
                            if (clixo == 7) {
                                lixo7.setSize(18, 22);
                            }
                            if (clixo == 8) {
                                lixo8.setSize(18, 22);
                            }
                            if (clixo == 9) {
                                lixo9.setSize(18, 22);
                            }
                            if (clixo == 10) {
                                lixo10.setSize(18, 22);
                            }
                            if (clixo == 11) {
                                lixo11.setSize(18, 22);
                            }
                            if (clixo == 12) {
                                lixo12.setSize(18, 22);
                            }
                            if (clixo == 13) {
                                lixo13.setSize(18, 22);
                            }
                            if (clixo == 14) {
                                lixo14.setSize(18, 22);
                            }
                            if (clixo == 15) {
                                lixo15.setSize(18, 22);
                            }
                            if (clixo == 16) {
                                lixo16.setSize(18, 22);
                            }
                            if (clixo == 17) {
                                lixo17.setSize(18, 22);
                            }
                            if (clixo == 18) {
                                lixo18.setSize(18, 22);
                            }
                            if (clixo == 19) {
                                lixo19.setSize(18, 22);
                            }
                            if (clixo == 20) {
                                lixo20.setSize(18, 22);
                            }
                            if (clixo == 21) {
                                lixo21.setSize(18, 22);
                            }
                            if (clixo == 22) {
                                lixo22.setSize(18, 22);
                            }
                            if (clixo == 23) {
                                lixo23.setSize(18, 22);
                            }
                            if (clixo == 24) {
                                lixo24.setSize(18, 22);
                            }
                            if (clixo == 25) {
                                lixo25.setSize(18, 22);
                            }
                            if (clixo == 26) {
                                lixo26.setSize(18, 22);
                            }
                            if (clixo == 27) {
                                lixo27.setSize(18, 22);
                            }
                            if (clixo == 28) {
                                lixo28.setSize(18, 22);
                            }
                        }
                        qlixo = qlixo + 2;
                    }
                }
            }
        });
    }

    public void ColisaoPer1(Component a, Component b1, Component b2, Component b3, Component b4, Component b5,
            Component b6, Component b7, Component b8, Component b9, Component b10, Component b11,
            Component b12, Component b13, Component b14, Component b15, Component b16, Component b17,
            Component b18, Component b19, Component b20, Component b21, Component b22, Component b23,
            Component b24, Component b25, Component b26, Component b27, Component b28) {
        Rectangle p1 = new Rectangle(a.getX(), a.getY(), a.getWidth(), a.getHeight());

        Rectangle obj1 = new Rectangle(b1.getX(), b1.getY(), b1.getWidth(), b1.getHeight());
        Rectangle obj2 = new Rectangle(b2.getX(), b2.getY(), b2.getWidth(), b2.getHeight());
        Rectangle obj3 = new Rectangle(b3.getX(), b3.getY(), b3.getWidth(), b3.getHeight());
        Rectangle obj4 = new Rectangle(b4.getX(), b4.getY(), b4.getWidth(), b4.getHeight());
        Rectangle obj5 = new Rectangle(b5.getX(), b5.getY(), b5.getWidth(), b5.getHeight());
        Rectangle obj6 = new Rectangle(b6.getX(), b6.getY(), b6.getWidth(), b6.getHeight());
        Rectangle obj7 = new Rectangle(b7.getX(), b7.getY(), b7.getWidth(), b7.getHeight());
        Rectangle obj8 = new Rectangle(b8.getX(), b8.getY(), b8.getWidth(), b8.getHeight());
        Rectangle obj9 = new Rectangle(b9.getX(), b9.getY(), b9.getWidth(), b9.getHeight());
        Rectangle obj10 = new Rectangle(b10.getX(), b10.getY(), b10.getWidth(), b10.getHeight());
        Rectangle obj11 = new Rectangle(b11.getX(), b11.getY(), b11.getWidth(), b11.getHeight());
        Rectangle obj12 = new Rectangle(b12.getX(), b12.getY(), b12.getWidth(), b12.getHeight());
        Rectangle obj13 = new Rectangle(b13.getX(), b13.getY(), b13.getWidth(), b13.getHeight());
        Rectangle obj14 = new Rectangle(b14.getX(), b14.getY(), b14.getWidth(), b14.getHeight());
        Rectangle obj15 = new Rectangle(b15.getX(), b15.getY(), b15.getWidth(), b15.getHeight());
        Rectangle obj16 = new Rectangle(b16.getX(), b16.getY(), b16.getWidth(), b16.getHeight());
        Rectangle obj17 = new Rectangle(b17.getX(), b17.getY(), b17.getWidth(), b17.getHeight());
        Rectangle obj18 = new Rectangle(b18.getX(), b18.getY(), b18.getWidth(), b18.getHeight());
        Rectangle obj19 = new Rectangle(b19.getX(), b19.getY(), b19.getWidth(), b19.getHeight());
        Rectangle obj20 = new Rectangle(b20.getX(), b20.getY(), b20.getWidth(), b20.getHeight());
        Rectangle obj21 = new Rectangle(b21.getX(), b21.getY(), b21.getWidth(), b21.getHeight());
        Rectangle obj22 = new Rectangle(b22.getX(), b22.getY(), b22.getWidth(), b22.getHeight());
        Rectangle obj23 = new Rectangle(b23.getX(), b23.getY(), b23.getWidth(), b23.getHeight());
        Rectangle obj24 = new Rectangle(b24.getX(), b24.getY(), b24.getWidth(), b24.getHeight());
        Rectangle obj25 = new Rectangle(b25.getX(), b25.getY(), b25.getWidth(), b25.getHeight());
        Rectangle obj26 = new Rectangle(b26.getX(), b26.getY(), b26.getWidth(), b26.getHeight());
        Rectangle obj27 = new Rectangle(b27.getX(), b27.getY(), b27.getWidth(), b27.getHeight());
        Rectangle obj28 = new Rectangle(b28.getX(), b28.getY(), b28.getWidth(), b28.getHeight());

        if (p1.intersects(obj1)) {
            MusicaLixo();
            this.lixo1.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj2)) {
            MusicaLixo();
            this.lixo2.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj3)) {
            MusicaLixo();
            this.lixo3.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj4)) {
            MusicaLixo();
            this.lixo4.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj5)) {
            MusicaLixo();
            this.lixo5.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj6)) {
            MusicaLixo();
            this.lixo6.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj7)) {
            MusicaLixo();
            this.lixo7.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj8)) {
            MusicaLixo();
            this.lixo8.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj9)) {
            MusicaLixo();
            this.lixo9.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj10)) {
            MusicaLixo();
            this.lixo10.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj11)) {
            MusicaLixo();
            this.lixo11.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj12)) {
            MusicaLixo();
            this.lixo12.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj13)) {
            MusicaLixo();
            this.lixo13.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj14)) {
            MusicaLixo();
            this.lixo14.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj15)) {
            MusicaLixo();
            this.lixo15.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj16)) {
            MusicaLixo();
            this.lixo16.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj17)) {
            MusicaLixo();
            this.lixo17.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");
        }
        if (p1.intersects(obj18)) {
            MusicaLixo();
            this.lixo18.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj19)) {
            MusicaLixo();
            this.lixo19.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj20)) {
            MusicaLixo();
            this.lixo20.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj21)) {
            MusicaLixo();
            this.lixo21.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj22)) {
            MusicaLixo();
            this.lixo22.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj23)) {
            MusicaLixo();
            this.lixo23.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj24)) {
            MusicaLixo();
            this.lixo24.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj25)) {
            MusicaLixo();
            this.lixo25.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj26)) {
            MusicaLixo();
            this.lixo26.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj27)) {
            MusicaLixo();
            this.lixo27.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }
        if (p1.intersects(obj28)) {
            MusicaLixo();
            this.lixo28.setSize(0, 0);
            Random random = new Random();
            this.pontosPer1 = this.pontosPer1 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp1.setText("" + pontosPer1 + " PONTOS");

        }

    }

    public void ColisaoPer2(Component a, Component b1, Component b2, Component b3, Component b4, Component b5,
            Component b6, Component b7, Component b8, Component b9, Component b10, Component b11,
            Component b12, Component b13, Component b14, Component b15, Component b16, Component b17,
            Component b18, Component b19, Component b20, Component b21, Component b22, Component b23,
            Component b24, Component b25, Component b26, Component b27, Component b28) {
        Rectangle p1 = new Rectangle(a.getX(), a.getY(), a.getWidth(), a.getHeight());

        Rectangle obj1 = new Rectangle(b1.getX(), b1.getY(), b1.getWidth(), b1.getHeight());
        Rectangle obj2 = new Rectangle(b2.getX(), b2.getY(), b2.getWidth(), b2.getHeight());
        Rectangle obj3 = new Rectangle(b3.getX(), b3.getY(), b3.getWidth(), b3.getHeight());
        Rectangle obj4 = new Rectangle(b4.getX(), b4.getY(), b4.getWidth(), b4.getHeight());
        Rectangle obj5 = new Rectangle(b5.getX(), b5.getY(), b5.getWidth(), b5.getHeight());
        Rectangle obj6 = new Rectangle(b6.getX(), b6.getY(), b6.getWidth(), b6.getHeight());
        Rectangle obj7 = new Rectangle(b7.getX(), b7.getY(), b7.getWidth(), b7.getHeight());
        Rectangle obj8 = new Rectangle(b8.getX(), b8.getY(), b8.getWidth(), b8.getHeight());
        Rectangle obj9 = new Rectangle(b9.getX(), b9.getY(), b9.getWidth(), b9.getHeight());
        Rectangle obj10 = new Rectangle(b10.getX(), b10.getY(), b10.getWidth(), b10.getHeight());
        Rectangle obj11 = new Rectangle(b11.getX(), b11.getY(), b11.getWidth(), b11.getHeight());
        Rectangle obj12 = new Rectangle(b12.getX(), b12.getY(), b12.getWidth(), b12.getHeight());
        Rectangle obj13 = new Rectangle(b13.getX(), b13.getY(), b13.getWidth(), b13.getHeight());
        Rectangle obj14 = new Rectangle(b14.getX(), b14.getY(), b14.getWidth(), b14.getHeight());
        Rectangle obj15 = new Rectangle(b15.getX(), b15.getY(), b15.getWidth(), b15.getHeight());
        Rectangle obj16 = new Rectangle(b16.getX(), b16.getY(), b16.getWidth(), b16.getHeight());
        Rectangle obj17 = new Rectangle(b17.getX(), b17.getY(), b17.getWidth(), b17.getHeight());
        Rectangle obj18 = new Rectangle(b18.getX(), b18.getY(), b18.getWidth(), b18.getHeight());
        Rectangle obj19 = new Rectangle(b19.getX(), b19.getY(), b19.getWidth(), b19.getHeight());
        Rectangle obj20 = new Rectangle(b20.getX(), b20.getY(), b20.getWidth(), b20.getHeight());
        Rectangle obj21 = new Rectangle(b21.getX(), b21.getY(), b21.getWidth(), b21.getHeight());
        Rectangle obj22 = new Rectangle(b22.getX(), b22.getY(), b22.getWidth(), b22.getHeight());
        Rectangle obj23 = new Rectangle(b23.getX(), b23.getY(), b23.getWidth(), b23.getHeight());
        Rectangle obj24 = new Rectangle(b24.getX(), b24.getY(), b24.getWidth(), b24.getHeight());
        Rectangle obj25 = new Rectangle(b25.getX(), b25.getY(), b25.getWidth(), b25.getHeight());
        Rectangle obj26 = new Rectangle(b26.getX(), b26.getY(), b26.getWidth(), b26.getHeight());
        Rectangle obj27 = new Rectangle(b27.getX(), b27.getY(), b27.getWidth(), b27.getHeight());
        Rectangle obj28 = new Rectangle(b28.getX(), b28.getY(), b28.getWidth(), b28.getHeight());

        if (p1.intersects(obj1)) {
            MusicaLixo();
            this.lixo1.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj2)) {
            MusicaLixo();
            this.lixo2.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj3)) {
            MusicaLixo();
            this.lixo3.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj4)) {
            MusicaLixo();
            this.lixo4.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj5)) {
            MusicaLixo();
            this.lixo5.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj6)) {
            MusicaLixo();
            this.lixo6.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj7)) {
            MusicaLixo();
            this.lixo7.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj8)) {
            MusicaLixo();
            this.lixo8.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj9)) {
            MusicaLixo();
            this.lixo9.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj10)) {
            MusicaLixo();
            this.lixo10.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj11)) {
            MusicaLixo();
            this.lixo11.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj12)) {
            MusicaLixo();
            this.lixo12.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj13)) {
            MusicaLixo();
            this.lixo13.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj14)) {
            MusicaLixo();
            this.lixo14.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj15)) {
            MusicaLixo();
            this.lixo15.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj16)) {
            MusicaLixo();
            this.lixo16.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj17)) {
            MusicaLixo();
            this.lixo17.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");
        }
        if (p1.intersects(obj18)) {
            MusicaLixo();
            this.lixo18.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj19)) {
            MusicaLixo();
            this.lixo19.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj20)) {
            MusicaLixo();
            this.lixo20.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj21)) {
            MusicaLixo();
            this.lixo21.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj22)) {
            MusicaLixo();
            this.lixo22.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj23)) {
            MusicaLixo();
            this.lixo23.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj24)) {
            MusicaLixo();
            this.lixo24.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj25)) {
            MusicaLixo();
            this.lixo25.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj26)) {
            MusicaLixo();
            this.lixo26.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj27)) {
            MusicaLixo();
            this.lixo27.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }
        if (p1.intersects(obj28)) {
            MusicaLixo();
            this.lixo28.setSize(0, 0);
            Random random = new Random();
            this.pontosPer2 = this.pontosPer2 + random.nextInt(20);
            this.qlixo = this.qlixo - 1;
            tp2.setText("" + pontosPer2 + " PONTOS");

        }

    }

    public void MusicaFundo() {
        somx = NeedForRecycling.class.getResource("x.wav");
        Somx = Applet.newAudioClip(somx);
        Somx.loop();
    }

    public void MusicaVitoria() {
        somz = NeedForRecycling.class.getResource("z.wav");
        Somz = Applet.newAudioClip(somz);
        Somz.play();
    }

    public void MusicaLixo() {
        somu = NeedForRecycling.class.getResource("u.wav");
        Somu = Applet.newAudioClip(somu);
        Somu.play();
    }

    public class ContarTempo extends Thread {

        public void run() {
            while (tempo != 0) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                if (animacaolixo > 2) {
                    animacaolixo = 1;
                }
                if (animacaolixo == 1) {
                    lixo1.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo2.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo3.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo4.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo5.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo6.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo7.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo8.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo9.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo10.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo11.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo12.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo13.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo14.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo15.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo16.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo17.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo18.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo19.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo20.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo21.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo22.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo23.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo24.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo25.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo26.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo27.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo28.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                }
                if (animacaolixo == 2) {
                    lixo1.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo2.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo3.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo4.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo5.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo6.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo7.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo8.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo9.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo10.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo11.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo12.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo13.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo14.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo15.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo16.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo17.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo18.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo19.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo20.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo21.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo22.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo23.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo24.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo25.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo26.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo27.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                    lixo28.setIcon(new ImageIcon("src/lixo/lixo" + animacaolixo + ".png"));
                }

                animacaolixo = animacaolixo + 1;
                tempo = tempo - 1;
                t1.setText("" + tempo);
            }
            Somx.stop();
            MusicaVitoria();
            dispose();
            Vitoria vitoria = new Vitoria(pontosPer1, pontosPer2);
            vitoria.setVisible(true);

        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        per1 = new javax.swing.JLabel();
        per2 = new javax.swing.JLabel();
        lixo1 = new javax.swing.JLabel();
        lixo2 = new javax.swing.JLabel();
        lixo3 = new javax.swing.JLabel();
        lixo4 = new javax.swing.JLabel();
        lixo5 = new javax.swing.JLabel();
        lixo6 = new javax.swing.JLabel();
        lixo7 = new javax.swing.JLabel();
        lixo8 = new javax.swing.JLabel();
        lixo9 = new javax.swing.JLabel();
        lixo10 = new javax.swing.JLabel();
        lixo11 = new javax.swing.JLabel();
        lixo12 = new javax.swing.JLabel();
        lixo13 = new javax.swing.JLabel();
        lixo14 = new javax.swing.JLabel();
        lixo15 = new javax.swing.JLabel();
        lixo16 = new javax.swing.JLabel();
        lixo17 = new javax.swing.JLabel();
        lixo18 = new javax.swing.JLabel();
        lixo19 = new javax.swing.JLabel();
        lixo20 = new javax.swing.JLabel();
        lixo21 = new javax.swing.JLabel();
        lixo22 = new javax.swing.JLabel();
        lixo23 = new javax.swing.JLabel();
        lixo24 = new javax.swing.JLabel();
        lixo25 = new javax.swing.JLabel();
        lixo26 = new javax.swing.JLabel();
        lixo27 = new javax.swing.JLabel();
        lixo28 = new javax.swing.JLabel();
        Mapa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        tp1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tp2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Need For Recycling");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(null);

        per1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/per1/per1s2.png"))); // NOI18N
        jPanel1.add(per1);
        per1.setBounds(640, 130, 22, 36);

        per2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/per2/per2s2.png"))); // NOI18N
        jPanel1.add(per2);
        per2.setBounds(670, 130, 22, 36);

        lixo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo1);
        lixo1.setBounds(670, 380, 20, 30);

        lixo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo2);
        lixo2.setBounds(600, 480, 20, 30);

        lixo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo3);
        lixo3.setBounds(460, 390, 20, 30);

        lixo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo4);
        lixo4.setBounds(500, 510, 20, 30);

        lixo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo5);
        lixo5.setBounds(550, 340, 20, 30);

        lixo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo6);
        lixo6.setBounds(250, 680, 20, 30);

        lixo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo7);
        lixo7.setBounds(770, 520, 20, 30);

        lixo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo8);
        lixo8.setBounds(470, 620, 20, 30);

        lixo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo9);
        lixo9.setBounds(260, 460, 20, 30);

        lixo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo10);
        lixo10.setBounds(380, 540, 20, 30);

        lixo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo11);
        lixo11.setBounds(780, 330, 20, 30);

        lixo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo12);
        lixo12.setBounds(390, 300, 20, 30);

        lixo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo13);
        lixo13.setBounds(190, 280, 20, 30);

        lixo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo14);
        lixo14.setBounds(150, 620, 20, 30);

        lixo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo15);
        lixo15.setBounds(630, 290, 20, 30);

        lixo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo16);
        lixo16.setBounds(290, 150, 20, 30);

        lixo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo17);
        lixo17.setBounds(110, 180, 20, 30);

        lixo18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo18);
        lixo18.setBounds(530, 600, 20, 30);

        lixo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo19);
        lixo19.setBounds(220, 380, 20, 30);

        lixo20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo20);
        lixo20.setBounds(40, 330, 20, 30);

        lixo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo21);
        lixo21.setBounds(700, 620, 20, 30);

        lixo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo22);
        lixo22.setBounds(450, 280, 20, 30);

        lixo23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo23);
        lixo23.setBounds(40, 670, 20, 30);

        lixo24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo24);
        lixo24.setBounds(170, 460, 20, 30);

        lixo25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo25);
        lixo25.setBounds(670, 480, 20, 30);

        lixo26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo26);
        lixo26.setBounds(230, 570, 20, 30);

        lixo27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo27);
        lixo27.setBounds(50, 520, 20, 30);

        lixo28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixo/lixo1.png"))); // NOI18N
        jPanel1.add(lixo28);
        lixo28.setBounds(100, 250, 20, 30);

        Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa/Mapa.png"))); // NOI18N
        Mapa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(Mapa);
        Mapa.setBounds(10, 110, 802, 602);

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t1.setText("100");

        tp1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VP/IP1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VP/IP2.png"))); // NOI18N

        tp2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(t1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tp2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tp2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 800, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lixo1;
    private javax.swing.JLabel lixo10;
    private javax.swing.JLabel lixo11;
    private javax.swing.JLabel lixo12;
    private javax.swing.JLabel lixo13;
    private javax.swing.JLabel lixo14;
    private javax.swing.JLabel lixo15;
    private javax.swing.JLabel lixo16;
    private javax.swing.JLabel lixo17;
    private javax.swing.JLabel lixo18;
    private javax.swing.JLabel lixo19;
    private javax.swing.JLabel lixo2;
    private javax.swing.JLabel lixo20;
    private javax.swing.JLabel lixo21;
    private javax.swing.JLabel lixo22;
    private javax.swing.JLabel lixo23;
    private javax.swing.JLabel lixo24;
    private javax.swing.JLabel lixo25;
    private javax.swing.JLabel lixo26;
    private javax.swing.JLabel lixo27;
    private javax.swing.JLabel lixo28;
    private javax.swing.JLabel lixo3;
    private javax.swing.JLabel lixo4;
    private javax.swing.JLabel lixo5;
    private javax.swing.JLabel lixo6;
    private javax.swing.JLabel lixo7;
    private javax.swing.JLabel lixo8;
    private javax.swing.JLabel lixo9;
    private javax.swing.JLabel per1;
    private javax.swing.JLabel per2;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel tp1;
    private javax.swing.JLabel tp2;
    // End of variables declaration//GEN-END:variables
}
