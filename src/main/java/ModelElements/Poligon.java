package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;

public class Poligon {
    public ArrayList<Point3D> points = new ArrayList<>();

    public Poligon(Point3D point){
        points.add(point);
    }
}
