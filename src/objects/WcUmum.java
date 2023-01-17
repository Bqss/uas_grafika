package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

/*
* parameter x- is the top upper left x corner of ther outer rectangle
* parameter y- is the top upper left y corner of the outer rectangle
* */
public class WcUmum extends Path2D.Double {
    int xInit = 2014;
    int yInit = 464;

    public WcUmum(int x, int y){
        Rectangle2D.Double outer = new Rectangle2D.Double(x,y,74,165);
        for (int i=0 ; i< 3 ; i++){
            Rectangle2D.Double dummy = new Rectangle2D.Double((2021- this.xInit +x),(476-this.yInit+y) + i * 22,60,16);
            this.append(dummy, false);
        }

        this.append(outer,false);
    }

}
