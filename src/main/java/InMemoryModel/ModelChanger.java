package InMemoryModel;

public interface ModelChanger {
    public void NotifyChange(IModelChangedObserver model);
}
