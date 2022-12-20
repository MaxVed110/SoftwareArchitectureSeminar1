package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;

/**
 * Хранилище
 */
public class ModelStore implements ModelChanger {
    ArrayList<PoligonalModel> models = new ArrayList<>();
    ArrayList<Scene> scenes = new ArrayList<>();
    ArrayList<Flash> flashes = new ArrayList<>();
    ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changeObservers = new ArrayList<>();

    public ModelStore(Texture texture){
        models.add(new PoligonalModel(texture));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models.get(0),cameras.get(0), flashes.get(0)));
    }

    public Scene getScene(int id){
        return scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChangedObserver model) {
    }
}
