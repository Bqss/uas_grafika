package objects;

import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


/*
* parameter x- left lower x curner of the object
* parameter y- left lower y curner of the object
* */
public class GedungMinimalis2 extends Path2D.Double {
    int xInit = 1079;
    int yInit = 629;
    public GedungMinimalis2(int x, int y){

        GeneralPath.Double bwhknn = new GeneralPath.Double();
        bwhknn.moveTo((1140-this.xInit+x),y);
        bwhknn.lineTo((1140-this.xInit+x),(544-this.yInit+y));
        bwhknn.lineTo((1173-this.xInit+x),(544-this.yInit+y));
        bwhknn.curveTo((1185-this.xInit+x),(544-this.yInit+y),(1195-this.xInit+x),(554-this.yInit+y),(1195-this.xInit+x),(566-this.yInit+y));
        bwhknn.lineTo((1195-this.xInit+x),y);
        bwhknn.closePath();

        GeneralPath.Double bwhkr = new GeneralPath.Double();
        bwhkr.moveTo(x,y);
        bwhkr.lineTo(x,(586-this.yInit+y));
        bwhkr.lineTo((1088-this.xInit+x),(586-this.yInit+y));
        bwhkr.curveTo((1093-this.xInit+x),(586-this.yInit+y),(1098-this.xInit+x),(590-this.yInit+y),(1098-this.xInit+x),(596-this.yInit+y));
        bwhkr.lineTo((1098-this.xInit+x),y);
        bwhkr.closePath();

        RoundRectangle2D.Double rrd = new RoundRectangle2D.Double((1104-this.xInit+x),(454-this.yInit+y),49,11,10,13);
        RoundRectangle2D.Double rrd2 = new RoundRectangle2D.Double((1104-this.xInit+x),(477-this.yInit+y),49,11,10,13);
        RoundRectangle2D.Double rrd3 = new RoundRectangle2D.Double((1104-this.xInit+x),(500-this.yInit+y),49,11,10,13);

        this.moveTo(x,y);
        this.lineTo(x,475);
        this.curveTo((1079-this.xInit + x),(457-this.yInit+y),(1093-this.xInit+x),(442-this.yInit+y),(1112-this.xInit+x),(442-this.yInit+y));
        this.lineTo((1162-this.xInit + x),(442-this.yInit+y));
        this.lineTo((1162-this.xInit + x),(544-this.yInit+y));
        this.lineTo((1140-this.xInit + x),(544-this.yInit+y));
        this.lineTo((1140-this.xInit + x),(629-this.yInit+y));
        this.closePath();

        this.append(rrd,false);
        this.append(rrd2,false);
        this.append(rrd3,false);
        this.append(bwhknn,false);
        this.append(bwhkr,false);
    }
}
