package objects;

import java.awt.geom.Arc2D;
import java.awt.geom.Path2D;

public class Pohon extends Path2D.Double {
    public  Pohon(){

        Arc2D bunder = new Arc2D.Double(568, 211, 193, 193, 0, 360, Arc2D.OPEN);
        this.append(bunder, false);
        Arc2D bunder2 = new Arc2D.Double(721, 211, 74, 74, 0, 360, Arc2D.OPEN);
        this.append(bunder2, false);
        Arc2D bunder3 = new Arc2D.Double(571, 307, 93, 93, 0, 360, Arc2D.OPEN);
        this.append(bunder3, false);
        Arc2D bunder4 = new Arc2D.Double(725, 411, 53, 53, 0, 360, Arc2D.OPEN);
        this.append(bunder4, false);
        Arc2D bunder5 = new Arc2D.Double(600, 454, 53, 53, 0, 360, Arc2D.OPEN);
        this.append(bunder5, false);
        this.moveTo(568 + 193/2,307+193/2);
        this.lineTo(568 + 193/2,556);
        this.moveTo(568 + 193/2,510);
        this.lineTo(732,457);
        this.moveTo(568 + 193/2,533);
        this.lineTo(600 + 53/2,501);

    }
}


