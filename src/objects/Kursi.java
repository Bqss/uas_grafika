package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Kursi extends Path2D.Double{


    public Kursi(double x, double y){
        double xf = -768 + x;
        double yf = -549 +y ;
        Rectangle2D.Double cagak1 = new Rectangle2D.Double(768 + xf,553+yf-9,4,9);
        Rectangle2D.Double cagak2 = new Rectangle2D.Double(768 + xf, 545 + yf - 5,48,4);
        Rectangle2D.Double papan = new Rectangle2D.Double(812 + xf,553+yf-9,4,9);
        this.append(cagak1,false);
        this.append(cagak2,false);
        this.append(papan,false);

    }
}
