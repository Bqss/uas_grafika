import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Date;

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
//        animateBG(g2d,bg);

//        bgTransform.setToScale(0.5,0.5);
//        bgTransform.translate(-(1080*3),0);

//        Pesawat miring = new Pesawat(200, 200,g2d);


        g2d.draw(bg);







    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1080*4,720);
        test.setLocationRelativeTo(null);
        test.setVisible(true);

    }
    public static void animateBG(Graphics2D g2d, Shape bg){
        AffineTransform bgTransform = new AffineTransform();
        AffineTransform singgleTranlasi = new AffineTransform();
        singgleTranlasi.setToTranslation(-1,0);

        for(int i=0;i<1000;i++)
        {
            clearWindow(g2d);

            g2d.draw(bgTransform.createTransformedShape(bg));
//            g2d.setPaint(random);
//            g2d.fill(bgTransform.createTransformedShape(miring));
//            g2d.setPaint(Hitam);
//            g2d.draw(Jalan);
            bgTransform.preConcatenate(singgleTranlasi);
            sustain(30);

            if(i == 999){
                clearWindow(g2d);
                bgTransform.translate(0,0);
                g2d.draw(bgTransform.createTransformedShape(bg));
                animateBG(g2d,bg);
            }

        }
    }

    private static void clearWindow(Graphics2D g2) {

        g2.setPaint(Color.white);
        g2.fill(new Rectangle(0,0,1080,720));
        g2.setPaint(Color.black);
        //To change body of generated methods, choose Tools | Templates.
    }

    private static  void sustain(int t) {
        long finish = (new Date()).getTime() + t;
        while( (new Date()).getTime() < finish ){} //To change body of generated methods, choose Tools | Templates.
    }
}


