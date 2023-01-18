package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class GedungToko extends Path2D.Double {
    double xInit = 429;
    double yInit = 571;
    public GedungToko(int x, int y){
        //gedung
        Rectangle2D kotak = new Rectangle2D.Double((429- this.xInit)+x ,(496- this.yInit)+y,48,74);
        this.append(kotak, false);
        //pintu
//        RoundRectangle2D kotak2 = new RoundRectangle2D.Float(659,497,74,111,71,71);
//        this.append(kotak2, false);
        this.moveTo((478- this.xInit)+x ,(543- this.yInit)+y);
        this.lineTo((478- this.xInit)+x ,(570- this.yInit)+y);
        this.lineTo((460- this.xInit)+x ,(570- this.yInit)+y);
        this.lineTo((460- this.xInit)+x ,(561- this.yInit)+y);
//        this.lineTo((662- this.xInit)+x ,(572- this.yInit)+y);
        this.curveTo((460- this.xInit)+x ,(551- this.yInit)+y,(468- this.xInit)+x ,(543- this.yInit)+y,(478- this.xInit)+x ,(543- this.yInit)+y);
//        this.closePath();
    }


}
