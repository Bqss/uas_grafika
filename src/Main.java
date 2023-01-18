import javax.swing.*;
import java.awt.*;


import objects.*;



public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Pesawat miring = new Pesawat();
        Pohon p = new Pohon(100,500);
//        GedungToko b = new GedungToko();
//        Pohon2 p2 = new Pohon2();
//        Awan2 a1 = new Awan2(100,400);


        g2d.draw(p);

    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1020,720);
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }
}


