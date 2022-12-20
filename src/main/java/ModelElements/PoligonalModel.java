package ModelElements;

public class PoligonalModel {
    Texture texture;
    Poligon poligon;

    public void setPoligon(){
        this.poligon = new Poligon();
    }

    public void setTexture(Texture texture){
        this.texture = texture;
    }
}
