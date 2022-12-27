import javax.swing.*;
import java.awt.*;


import objects.Pesawat;



public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Pesawat miring = new Pesawat(172,240);
        g2d.draw(miring);

    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1920,1080);
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }
}


