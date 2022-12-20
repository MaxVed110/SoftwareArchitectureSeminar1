package ModelElements;

import java.util.AbstractList;
import java.util.ArrayList;

public class Scene {
    public int id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    public Scene(PoligonalModel newModel, Camera newCamera, Flash newFlash){
        models.add(newModel);
        cameras.add(newCamera);
    }

    //заглушка
    public ArrayList<Flash> addFlash (Flash flash){
        this.flashes.add(flash);
        return  flashes;
    }
}
