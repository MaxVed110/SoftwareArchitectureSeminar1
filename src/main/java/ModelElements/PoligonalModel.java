package ModelElements;

import Stuff.Point3D;

public class PoligonalModel {
    Texture texture;
    Poligon poligon;

    public PoligonalModel(Texture newTexture){
        this.poligon = new Poligon(new Point3D());
        this.texture = newTexture;
    }
}
