package objects;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;


public class Pesawat extends Path2D.Double {

    public Pesawat(int x, int y, Graphics2D g) {
        Ellipse2D.Double l = new Ellipse2D.Double(x + 76, y + 68, 25, 25);
        Ellipse2D.Double l2 = new Ellipse2D.Double(x + 130.7, y + 63, 32, 32);
        Ellipse2D.Double l3 = new Ellipse2D.Double(x + 199.5, y + 66, 32.5, 32.5);

        GeneralPath pathKepala = new GeneralPath();
        pathKepala.moveTo((465 - 172) + x, (281 - 240) + y);
        pathKepala.curveTo((456 - 172) + x, (305 - 240) + y, (462 - 172) + x, (332 - 240) + y, (486 - 172) + x, (342 - 240) + y);
        pathKepala.curveTo((502 - 172) + x, (348 - 240) + y, (519 - 172) + x, (345 - 240) + y, (533 - 172) + x, (335 - 240) + y);
        pathKepala.quadTo((520 - 172) + x, (295 - 240) + y, (465 - 172) + x, (281 - 240) + y);
        pathKepala.closePath();

        GeneralPath vinyl1 = new GeneralPath();
        vinyl1.moveTo((203 - 172) + x, (371 - 240) + y);
        vinyl1.lineTo((210 - 172) + x, (378 - 240) + y);
        vinyl1.lineTo((242 - 172) + x, (384 - 240) + y);
        vinyl1.lineTo((203 - 172) + x, (371 - 240) + y);

        GeneralPath vinyl2 = new GeneralPath();
        vinyl2.moveTo((221 - 172) + x, (385 - 240) + y);
        vinyl2.quadTo((245 - 172) + x, (396 - 240) + y, (269 - 172) + x, (397 - 240) + y);
        vinyl2.quadTo((279 - 172) + x, (396 - 240) + y, (286 - 172) + x, (398 - 240) + y);
        vinyl2.lineTo((263 - 172) + x, (390 - 240) + y);
        vinyl2.lineTo((221 - 172) + x, (385 - 240) + y);

//        main part pesawat
        this.moveTo(x, y);
        this.curveTo((192 - 172) + x, (236 - 240) + y, (199 - 172) + x, (262 - 240) + y, (205 - 172) + x, (275 - 240) + y);
        this.curveTo((206 - 172) + x, (276 - 240) + y, (207 - 172) + x, (277 - 240) + y, (209 - 172) + x, (277 - 240) + y);
        this.quadTo((335 - 172) + x, (250 - 240) + y, (465 - 172) + x, (281 - 240) + y);
        this.curveTo((500 - 172) + x, (291 - 240) + y, (525 - 172) + x, (307 - 240) + y, (533 - 172) + x, (334 - 240) + y);

        this.quadTo((537 - 172) + x, (343 - 240) + y, (535 - 172) + x, (350 - 240) + y);
        this.quadTo((532 - 172) + x, (375 - 240) + y, (515 - 172) + x, (391 - 240) + y);
        this.quadTo((492 - 172) + x, (412 - 240) + y, (400 - 172) + x, (409 - 240) + y);

        this.quadTo((405 - 172) + x, (387 - 240) + y, (400 - 172) + x, (370 - 240) + y);
        this.quadTo((398 - 172) + x, (369 - 240) + y, (394 - 172) + x, (367 - 240) + y);
        this.lineTo((322 - 172) + x, (367 - 240) + y);
        this.quadTo((320 - 172) + x, (368 - 240) + y, (320 - 172) + x, (370 - 240) + y);
        this.lineTo((321 - 172) + x, (410 - 240) + y);
        this.quadTo((220 - 172) + x, (405 - 240) + y, (181 - 172) + x, (375 - 240) + y);
        this.curveTo((123 - 172) + x, (290 - 240) + y, (152 - 172) + x, (245 - 240) + y, x, y);

        this.moveTo((394 - 172) + x, (366 - 240) + y);
        this.quadTo((398 - 172) + x, (369 - 240) + y, (400 - 172) + x, (370 - 240) + y);
        this.quadTo((405 - 172) + x, (387 - 240) + y, (400 - 172) + x, (409 - 240) + y);

//        bottom wing
        this.curveTo((395 - 172) + x, (463 - 240) + y, (376 - 172) + x, (546 - 240) + y, (343 - 172) + x, (540 - 240) + y);
        this.quadTo((330 - 172) + x, (537 - 240) + y, (321 - 172) + x, (410 - 240) + y);
        this.lineTo((320 - 172) + x, (370 - 240) + y);
        this.quadTo((320 - 172) + x, (368 - 240) + y, (322 - 172) + x, (367 - 240) + y);

//      upper wing
        this.moveTo((313 - 172) + x, (265 - 240) + y);
        this.quadTo((297 - 172) + x, (130 - 240) + y, (313 - 172) + x, (121 - 240) + y);
        this.curveTo((354 - 172) + x, (108 - 240) + y, (390 - 172) + x, (239 - 240) + y, (389 - 172) + x, (268 - 240) + y);
        this.quadTo((349 - 170) + x, (264 - 240) + y, (313 - 172) + x, (265 - 240) + y);

//  main plane coloring

        g.setColor(Color.white);
        g.setStroke(new BasicStroke(2.0f));
        g.fill(this);
        g.setColor(Color.black);


// additional coloring for wings and etc

        g.setColor(new Color(253, 139, 41));
        g.fill(l);
        g.fill(l2);
        g.fill(l3);
        g.fill(vinyl1);
        g.fill(vinyl2);
        g.fill(pathKepala);
        g.setColor(Color.black);


//appending additional
        this.append(l, false);
        this.append(l2, false);
        this.append(l3, false);
        this.append(pathKepala, false);
        this.append(vinyl1, false);
        this.append(vinyl2, false);

    }
}



