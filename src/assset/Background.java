package assset;

import objects.*;


import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Background extends Path2D.Double{
    int xFrame = 1080;
    public Background(Graphics2D g){

        AffineTransform scale = new AffineTransform();
//        AffineTransform scale2 = new AffineTransform();

        scale.scale(0.75,0.75);


//        jalan raya
//      garis atas
        moveTo(0,573);
        lineTo(this.xFrame*4,573);
        closePath();

//        garis bawah
        moveTo(0,717);
        lineTo(this.xFrame*4,717);
        closePath();


//       frame pertama
//        awan
        this.append(new Awan3(101,122),false);
        this.append(new Awan2(292,230),false);
        this.append(new Awan1(545,134),false);
        this.append(scale.createTransformedShape(new Awan3(373*(1/0.75),102*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan3(692*(1/0.75),88*(1/0.75))), false);
        scale.setToScale(0.5,0.5);
        this.append(scale.createTransformedShape(new Awan1(833*2,152*2)),false);
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan1(1003*(1/0.75),245*(1/0.75))), false);

//        gedung
        this.append(new GedungKantor(49,571),false);
        this.append(new RumahMinimalis(184,571),false);
        this.append(new WcUmum(341,406),false);
        this.append(new GedungToko(429,571),false);
        this.append(new GedungMinimalis(499,368),false);
        this.append(new Kursi(678,568), false);
        this.append(new Kursi(999,568), false);
        scale.setToScale(1.3,1.3);
        this.append(scale.createTransformedShape(new RumahMinimalis(791/1.3,571/1.3)), false);
//        pohon
        this.append(new Pohon(297, 571), false);
        this.append(new Pohon2(636, 571), false);
        this.append(new Pohon2(961, 571), false);
        this.append(new Pohon3(656,571),false);

//        frame kedua x + xFrame

//        awan
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan3((0.7 + +this.xFrame)*(1/0.75),159*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((155+this.xFrame) *(1/0.75),277*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((238+this.xFrame) *(1/0.75),178*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan2((286 + this.xFrame)*(1/0.75),89*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan2((452 + this.xFrame)*(1/0.75),231*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((698+this.xFrame) *(1/0.75),127*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan3((877+this.xFrame)*(1/0.75),80*(1/0.75))), false);
        scale.setToScale(0.5,0.5);
        this.append(scale.createTransformedShape(new Awan1((853+this.xFrame)*2,223*2)),false);
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan1((1003+this.xFrame)*(1/0.75),223*(1/0.75))),false);
        this.append(scale.createTransformedShape(new Awan3((0.7+this.xFrame)*(1/0.75),159*(1/0.75))), false);

//        gedung
        this.append(new GedungMinimalis2(29+this.xFrame,571),false);
        this.append(new GedungKosong(158+this.xFrame,341,94,229),false);
        this.append(new GedungKantor(327+this.xFrame,571),false);
        this.append(new RumahMinimalis(455+this.xFrame,571),false);
        this.append(new GedungKosong(596+this.xFrame,405,73,164),false);
        this.append(new GedungToko(688+this.xFrame,571),false);
        this.append(new GedungMinimalis(758+this.xFrame,368),false);
        this.append(new WcUmum(964+this.xFrame,406),false);
        this.append(new GedungToko(1053+this.xFrame,571),false);

//        pohon
        this.append(new Pohon(559 + this.xFrame, 571), false);
        this.append(new Pohon2(894 + this.xFrame, 571), false);

//        frame ketiga x + xFrame*2
//        awan
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan3((0.7 + (this.xFrame*2))*(1/0.75),159*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((155+(this.xFrame*2)) *(1/0.75),277*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((238+(this.xFrame*2)) *(1/0.75),178*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan2((286 + (this.xFrame*2))*(1/0.75),89*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan2((452 + (this.xFrame*2))*(1/0.75),231*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((698+(this.xFrame*2)) *(1/0.75),127*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan3((877+(this.xFrame*2))*(1/0.75),80*(1/0.75))), false);
        scale.setToScale(0.5,0.5);
        this.append(scale.createTransformedShape(new Awan1((853+(this.xFrame*2))*2,223*2)),false);
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan1((1003+(this.xFrame*2))*(1/0.75),223*(1/0.75))),false);
        this.append(scale.createTransformedShape(new Awan3((0.7+(this.xFrame*2))*(1/0.75),159*(1/0.75))), false);
//      gedung
        this.append(new GedungMinimalis(43 +((this.xFrame*2)),368),false);
        this.append(new GedungKantor(261 +(this.xFrame*2),571),false);
        this.append(new RumahMinimalis(396 +(this.xFrame*2),571),false);
        this.append(new WcUmum(552 +(this.xFrame*2),406),false);
        this.append(new GedungToko(641 +(this.xFrame*2),571),false);
        this.append(new GedungMinimalis(711 +(this.xFrame*2),368),false);
        this.append(new Kursi(904 +(this.xFrame*2),568),false);
        scale.setToScale(1.3,1.3);
        this.append(scale.createTransformedShape(new RumahMinimalis(((1003+(this.xFrame*2))/1.3),571/1.3)), false);

//        pohon
        this.append(new Pohon2(180 + (this.xFrame*2), 571), false);
        this.append(new Pohon(499 + (this.xFrame*2), 571), false);
        this.append(new Pohon2(848 + (this.xFrame*2), 571), false);
        this.append(new Pohon3(164 + (this.xFrame*2), 571), false);
        this.append(new Pohon3(195 + (this.xFrame*2), 571), false);

//        frame 4 x + xFrame*3
//        awan
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan3((0.7 + (this.xFrame*3))*(1/0.75),159*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((155+(this.xFrame*3)) *(1/0.75),277*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((238+(this.xFrame*3)) *(1/0.75),178*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan2((286 + (this.xFrame*3))*(1/0.75),89*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan2((452 + (this.xFrame*3))*(1/0.75),231*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan1((698+(this.xFrame*3)) *(1/0.75),127*(1/0.75))), false);
        this.append(scale.createTransformedShape(new Awan3((877+(this.xFrame*3))*(1/0.75),80*(1/0.75))), false);
        scale.setToScale(0.5,0.5);
        this.append(scale.createTransformedShape(new Awan1((853+(this.xFrame*3))*2,223*2)),false);
        scale.setToScale(0.75,0.75);
        this.append(scale.createTransformedShape(new Awan1((1003+(this.xFrame*3))*(1/0.75),223*(1/0.75))),false);
        this.append(scale.createTransformedShape(new Awan3((0.7+(this.xFrame*3))*(1/0.75),159*(1/0.75))), false);


//        gedung
        this.append(new GedungMinimalis2(240+(this.xFrame*3),571),false);
        this.append(new GedungKosong(370+(this.xFrame*3),341,94,229),false);
        this.append(new GedungKantor(519+(this.xFrame*3),571),false);
        this.append(new RumahMinimalis(654+(this.xFrame*3),571),false);
        this.append(new GedungKosong(804+(this.xFrame*3),405,73,164),false);
        this.append(new GedungToko(900+(this.xFrame*3),571),false);
        this.append(new GedungMinimalis(970+(this.xFrame*3),368),false);

//        pohon
        this.append(new Pohon2(93 + (this.xFrame*3), 571), false);
        this.append(new Pohon(771 + (this.xFrame*3), 571), false);
        this.append(new Pohon3(138 + (this.xFrame*3), 571), false);
        this.append(new Pohon3(170 + (this.xFrame*3), 571), false);
    }


}
