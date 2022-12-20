package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {
    Point3D location;
    Angle3D angle;

    public void rotate(Angle3D newAngle){
        this.angle = newAngle;
    }

    public void move(Point3D newPoint){
        this.location = newPoint;
    }
}
