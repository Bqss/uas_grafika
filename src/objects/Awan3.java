package objects;

import java.awt.geom.Path2D;

public class Awan3 extends Path2D.Double {
    double xInit = 101;
    double yInit = 122;
    public Awan3(double x, double y){
        double x2 = - this.xInit + x;
        double y2 = - this.yInit + y;
        this.moveTo(101 + x2,122 + y2);
        this.curveTo(93 + x2,120 +y2,87+x2,112+y2,87 + x2,102 + y2);
        this.curveTo(87 + x2,91 + y2,96 + x2,82 + y2,107 + x2,82 + y2);
        this.curveTo(107 + x2,73 + y2,113 + x2,67 + y2, 122 + x2,67 + y2);
        this.curveTo(126 + x2,67 + y2,129 + x2,68 + y2,132 + x2,71 + y2 );
        this.curveTo(136 + x2,62 + y2,145 + x2,55 + y2,156 + x2,55 + y2);
        this.curveTo(171 + x2,55 +y2,183+x2,67+y2,182+x2,90+y2);
        this.curveTo(190+x2,89+y2,197+x2,94+y2,198+x2,102+y2);
        this.curveTo(199+x2,106+y2,198+x2,110+y2,197+x2,113+y2);
        this.curveTo(190+x2,122+y2,189+x2,123+y2,184+x2,123+y2);
        this.curveTo(163+x2,126+y2,103+x2,123+y2,101+x2,122+y2);
//        this.curveTo(919 + x2,508 + y2,905 + x2,491+y2,905+x2,471+y2);
        closePath();





    }
}
