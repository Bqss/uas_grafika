package objects;

import java.awt.geom.Path2D;

public class Awan1 extends Path2D.Double {
    int xInit = 143;
    int yInit = 451;
    public Awan1(int x, int y){
        int x2 = - this.xInit + x;
        int y2 = - this.yInit + y;
        this.moveTo(220 +x2, 495+y2 );
        this.curveTo(213+x2,499+y2,204+x2,502+y2,194+x2,501+y2);
        this.curveTo(166+x2,501+y2,144+x2,478+y2,143+x2,451+y2);
        this.curveTo(141+x2,421+y2,166+x2,396+y2,195+x2,396+y2);
        this.curveTo(198+x2,396+y2,201+x2,396+y2,203+x2,396+y2);
        this.curveTo(212+x2,381+y2,229+x2,371+y2,248+x2,371+y2);
        this.curveTo(268+x2,371+y2,285+x2,381+y2,294+x2,397+y2);
        this.curveTo(302+x2,392+y2,311+x2,389+y2,322+x2,389+y2);
        this.curveTo(351+x2,389+y2,374+x2,413+y2,374+x2,442+y2);
        this.curveTo(375+x2,470+y2,352+x2,494+y2,323+x2,495+y2);
        this.curveTo(316+x2,495+y2,310+x2,494+y2,304+x2,492+y2);
        this.curveTo(295+x2,506+y2,279+x2,514+y2,261+x2,514+y2);
        this.curveTo(245+x2,514+y2,230+x2,507+y2,220+x2,495+y2);
        this.closePath();
    }
}
