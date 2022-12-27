package objects;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class Pesawat extends Path2D.Double {
    public Pesawat(int x, int y){
        Ellipse2D.Double l = new Ellipse2D.Double(x + 76,y + 68,25,25);
        Ellipse2D.Double l2 = new Ellipse2D.Double(x + 130.7,y + 63,32,32);
        Ellipse2D.Double l3 = new Ellipse2D.Double(x + 199.5,y + 66,32.5,32.5);
        this.moveTo(x,y);
        this.curveTo(192,236,199,262,205,275);
        this.curveTo(206,276,207,277.26,209,277);
        this.quadTo(335,250,465.5,281);
        this.curveTo(500,291,525,307,533,334);
        this.moveTo(465.5,281);
        this.curveTo(456,305,462.5,332,486,342);
        this.curveTo(502,348.5,519,345,533,335);
        this.quadTo(537,343,535,350);
        this.quadTo(532,375,515,391);
        this.quadTo(492,412,400,409);
        this.quadTo(405,387,400,370);
        this.quadTo(398,369,394,367);
        this.lineTo(322,367);
        this.quadTo(320.5,368,320,370);
        this.lineTo(321,410);
        this.quadTo(322,500,343,540);
        this.curveTo(376,546,395,462.5,400,409);
        this.moveTo(321,410);
        this.quadTo(220,405,181,375);
        this.curveTo(123,290.4,152,245,172.6,240);
        this.moveTo(313,265);
        this.quadTo(297,130.5,313,121);
        this.curveTo(354,108,390.5,239,389,268);
        this.moveTo(203.5,371.5);
        this.lineTo(210,378);
        this.lineTo(242.5,384);
        this.lineTo(203.5,371.5);
        this.moveTo(221,385.6);
        this.quadTo(245,396,269,397);
        this.quadTo(279,396,286,398);
        this.lineTo(263,390.6);
        this.lineTo(221,385.6);

        this.append(l,false);
        this.append(l2,false);
        this.append(l3,false);

    }
}



