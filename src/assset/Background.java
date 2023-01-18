package assset;

import objects.*;


import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Background extends Path2D.Double{
    int xFrame = 1080;
    public Background(Graphics2D g){

//       frame pertama
//        this.append(new GedungKantor(49,571),false);
//        this.append(new RumahMinimalis(184,571),false);
//        this.append(new WcUmum(341,406),false);
//        this.append(new GedungToko(429,571),false);
//        this.append(new GedungMinimalis(499,368),false);
//        this.append(new RumahMinimalis(791,571),false);

//        frame kedua x + xFrame
//        this.append(new GedungMinimalis2(29,571),false);
//        this.append(new GedungKosong(158,341,94,229),false);
//        this.append(new GedungKantor(327,571),false);
//        this.append(new RumahMinimalis(455,571),false);
//        this.append(new GedungKosong(596,405,73,164),false);
//        this.append(new GedungToko(688,571),false);
//        this.append(new GedungMinimalis(758,368),false);
//        this.append(new WcUmum(964,406),false);
//        this.append(new GedungToko(1053,571),false);

//        frame ketiga x + xFrame*2
//        this.append(new GedungMinimalis(43,368),false);
//        this.append(new GedungKantor(261,571),false);
//        this.append(new RumahMinimalis(396,571),false);
//        this.append(new WcUmum(552,406),false);
//        this.append(new GedungToko(641,571),false);
//        this.append(new GedungMinimalis(711,368),false);
//        this.append(new RumahMinimalis(1003,571),false);

//        frame 4 x + xFrame*3
//        this.append(new GedungMinimalis2(240,571),false);
//        this.append(new GedungKosong(370,341,94,229),false);
//        this.append(new GedungKantor(519,571),false);
//        this.append(new RumahMinimalis(654,571),false);
//        this.append(new GedungKosong(804,405,73,164),false);
//        this.append(new GedungToko(900,571),false);
//        this.append(new GedungMinimalis(970,368),false);
        this.append(new Awan3(101,122),false);

    }
}
