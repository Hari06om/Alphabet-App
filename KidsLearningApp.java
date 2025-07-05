import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

class KidsLearningApp {
    public static void main(String[] rk) {
        JFrame f = new JFrame("English LKG");
        f.setSize(1000, 1000);
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.YELLOW);

        // Panel for grid of buttons
        JPanel p = new JPanel();
        GridLayout gl = new GridLayout(6, 5, 10, 10);
        p.setLayout(gl);
        p.setBackground(Color.YELLOW);

        JButton[] buttons = new JButton[26];
        String[] fruits = {
            "a.png", "b.png", "c.png", "d.png", "e.png", "f.png",
            "g.png", "h.png", "i.png", "j.png", "k.png", "l.png",
            "m.png", "n.png", "o.png", "p.png", "q.png", "r.png",
            "s.png", "t.png", "u.png", "v.png", "w.png", "x.png",
            "y.png", "z.png"
        };

        // Create buttons and add scaled icons
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setPreferredSize(new Dimension(150, 150)); // Square buttons
            try {
                BufferedImage img = ImageIO.read(new File(fruits[i]));
                Image scaledImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                buttons[i].setIcon(new ImageIcon(scaledImg));
            } catch (IOException e) {
                System.out.println("Error loading image: " + fruits[i]);
            }
            p.add(buttons[i]);
        }

        f.add(p);
        f.setVisible(true);

        // Sound listener
        class MyListener implements ActionListener {
            public void actionPerformed(ActionEvent ae) {
                String name = "";
                if (ae.getSource() == buttons[0]) name = "a.wav";
                else if (ae.getSource() == buttons[1]) name = "b.wav";
                else if (ae.getSource() == buttons[2]) name = "c.wav";
                else if (ae.getSource() == buttons[3]) name = "d.wav";
                else if (ae.getSource() == buttons[4]) name = "e.wav";
                else if (ae.getSource() == buttons[5]) name = "f.wav";
                else if (ae.getSource() == buttons[6]) name = "g.wav";
                else if (ae.getSource() == buttons[7]) name = "h.wav";
                else if (ae.getSource() == buttons[8]) name = "i.wav";
                else if (ae.getSource() == buttons[9]) name = "j.wav";
                else if (ae.getSource() == buttons[10]) name = "k.wav";
                else if (ae.getSource() == buttons[11]) name = "l.wav";
                else if (ae.getSource() == buttons[12]) name = "m.wav";
                else if (ae.getSource() == buttons[13]) name = "n.wav";
                else if (ae.getSource() == buttons[14]) name = "o.wav";
                else if (ae.getSource() == buttons[15]) name = "p.wav";
                else if (ae.getSource() == buttons[16]) name = "q.wav";
                else if (ae.getSource() == buttons[17]) name = "r.wav";
                else if (ae.getSource() == buttons[18]) name = "s.wav";
                else if (ae.getSource() == buttons[19]) name = "t.wav";
                else if (ae.getSource() == buttons[20]) name = "u.wav";
                else if (ae.getSource() == buttons[21]) name = "v.wav";
                else if (ae.getSource() == buttons[22]) name = "w.wav";
                else if (ae.getSource() == buttons[23]) name = "x.wav";
                else if (ae.getSource() == buttons[24]) name = "y.wav";
                else if (ae.getSource() == buttons[25]) name = "z.wav";


                if (!name.isEmpty()) {
                    try {
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(name));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        System.out.println("Error playing sound: " + name);
                    }
                }
            }
        }

        // Add listener to only buttons with sounds
        MyListener ml = new MyListener();
        buttons[0].addActionListener(ml); // a
        buttons[1].addActionListener(ml); // b        buttons[2].addActionListener(ml); // c
        buttons[2].addActionListener(ml); // c
        buttons[3].addActionListener(ml); // d
        buttons[4].addActionListener(ml); // e
        buttons[5].addActionListener(ml); // f
        buttons[6].addActionListener(ml); // g
        buttons[7].addActionListener(ml); // h
        buttons[8].addActionListener(ml); // i
        buttons[9].addActionListener(ml); // j
        buttons[10].addActionListener(ml); // k
        buttons[11].addActionListener(ml); // l
        buttons[12].addActionListener(ml); // m
        buttons[13].addActionListener(ml); // n
        buttons[14].addActionListener(ml); // o
        buttons[15].addActionListener(ml); // p
        buttons[16].addActionListener(ml); // q
        buttons[17].addActionListener(ml); // r
        buttons[18].addActionListener(ml); // s
        buttons[19].addActionListener(ml); // t
        buttons[20].addActionListener(ml); // u
        buttons[21].addActionListener(ml); // v
        buttons[22].addActionListener(ml); // w
        buttons[23].addActionListener(ml); // x
        buttons[24].addActionListener(ml); // y
        buttons[25].addActionListener(ml); // z
        
    }
}
