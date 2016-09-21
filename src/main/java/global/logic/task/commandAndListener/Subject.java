package global.logic.task.commandAndListener;


public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserversChanelChange();

    public void notifyObserversTvState();

}
