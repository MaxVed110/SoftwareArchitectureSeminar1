package ModelElements;

import java.util.ArrayList;

public class Scene {
    public int id;
    public PoligonalModel models;
    public ArrayList<Flash> flashes;

    public ArrayList<Flash> addFlash (Flash flash){
        this.flashes.add(flash);
        return  flashes;
    }
}
