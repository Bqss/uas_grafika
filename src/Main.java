import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

import assset.Background;
import objects.*;



public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Background bg = new Background(g2d);
        RumahMinimalis rm = new RumahMinimalis(184,570);
        g2d.draw(bg);



    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1080,720);
        test.setLocationRelativeTo(null);
        test.setVisible(true);

    }
}


