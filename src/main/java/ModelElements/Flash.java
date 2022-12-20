package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;
import java.awt.Color;

/**
 * класс источник света
 */
public class Flash {
    Point3D location;
    Angle3D angle;
    Color color;
    Float power;

    public Flash(){

    }
    /**
     * поворот источника света
     * @param newAngle
     */
    public void rotate(Angle3D newAngle){
        this.angle = newAngle;
    }

    /**
     * переместить к точке
     * @param newPoint
     */
    public void move(Point3D newPoint){
        this.location = newPoint;
    }
}
