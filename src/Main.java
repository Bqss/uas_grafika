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
        Pohon p = new Pohon();
        GedungToko b = new GedungToko();
        Pohon2 p2 = new Pohon2();




//        g2d.draw(miring);
//        g2d.draw(p);
        g2d.draw(p2);
        g2d.draw(p2.Daun());

    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1366,768);
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }
}


