package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class GedungToko extends Path2D.Double {
    public GedungToko(){
        //gedung
        Rectangle2D kotak = new Rectangle2D.Double(531,299,203,310);
        this.append(kotak, false);
        //pintu
//        RoundRectangle2D kotak2 = new RoundRectangle2D.Float(659,497,74,111,71,71);
//        this.append(kotak2, false);
        this.moveTo(733,610);
        this.lineTo(733,500);
        this.moveTo(662,610);
        this.lineTo(733,610);
        this.moveTo(662,610);
        this.lineTo(662,572);
        this.curveTo(662,572,683,521,733,500);


    }


}
