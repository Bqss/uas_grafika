import javax.swing.*;
import java.awt.*;


import objects.*;



public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
//        Pesawat miring = new Pesawat(400,240);
        GedungKantor gedung1 = new GedungKantor(19,630);
        g2d.draw(gedung1);
//        g2d.draw(miring);

        g2d.draw(miring);
        g2d.draw(p);
    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1366,768);
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }
}


