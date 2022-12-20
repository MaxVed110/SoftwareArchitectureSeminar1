package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;

public class ModelStore implements ModelChanger {
    PoligonalModel models;
    Scene scene;
    ArrayList<Flash> flashes;
    Camera camera;
    private IModelChangedObserver changeObservers;

    public Scene getScene(int id){
        this.scene = new Scene();
        this.scene.id = id;
        this.models = new PoligonalModel();
        this.scene.models = models;
        this.flashes.add(new Flash());
        return this.scene;
    }


    @Override
    public void NotifyChange(IModelChangedObserver model) {
        this.changeObservers = model;
    }
}
