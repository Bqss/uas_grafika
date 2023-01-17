import javax.swing.*;
import java.awt.*;
import objects.*;



public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Pesawat miring = new Pesawat();
        Pohon p = new Pohon();

//        Pesawat miring = new Pesawat(400,240, g2d);
//         g2d.draw(miring);
        RumahMinimalis rm1 = new RumahMinimalis(154,628);
        g2d.draw(rm1);

    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1920,1080);
        test.setLocationRelativeTo(null);
        test.setVisible(true);

    }
}


