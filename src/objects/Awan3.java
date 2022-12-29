package objects;

import java.awt.geom.Path2D;

public class Awan3 extends Path2D.Double {
    int xInit = 905;
    int yInit = 471;
    public Awan3(int x, int y){
        int x2 = - this.xInit + x;
        int y2 = - this.yInit + y;
        this.moveTo(905 + x2,471 + y2);
        this.curveTo(905 + x2,446 +y2,925+x2,426+y2,949 + x2,425 + y2);
        this.curveTo(949 + x2,407 + y2,963 + x2,393 + y2,981 + x2,393 + y2);
        this.curveTo(990 + x2,393 + y2,998 + x2,396 + y2, 1003 + x2,402 + y2);
        this.curveTo(1012 + x2,382 + y2,1033 + x2,367 + y2,1057 + x2,367 + y2 );
        this.curveTo(1089 + x2,367 + y2,1115 + x2,393 + y2,1115 + x2,425 + y2);
        this.curveTo(1115 + x2,431 +y2,1114+x2,437+y2,1112+x2,443+y2);
        this.curveTo(1129+x2,441+y2,1145+x2,453+y2,1148+x2,470+y2);
        this.curveTo(1150+x2,478+y2,1148+x2,487+y2,1144+x2,493+y2);
        this.curveTo(1129+x2,514+y2,1129+x2,515+y2,1117+x2,516+y2);
        this.curveTo(1072+x2,521+y2,941+x2,515+y2,937+x2,514+y2);
        this.curveTo(919 + x2,508 + y2,905 + x2,491+y2,905+x2,471+y2);
        closePath();





    }
}
