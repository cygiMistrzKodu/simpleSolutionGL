package global.logic.task.commandAndListener;

import java.util.ArrayList;
import java.util.List;

public class Tv implements Subject {

    private List<Observer> observers;

    private boolean on;
    private int chanelNumber;

    public Tv() {
        observers = new ArrayList<>();
    }

    public void switchOn() {
        on = true;
        tvStateChange();
    }

    public void switchOff() {
        on = false;
        tvStateChange();
    }

    public void chanelUp() {
        if (chanelNumber < 900) {
            chanelNumber++;
            chanelChange();
        }
    }

    public void chanelDown() {
        if (chanelNumber > 0) {
            chanelNumber--;
            chanelChange();
        }
    }

    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    private void chanelChange() {
        notifyObserversChanelChange();
    }

    private void tvStateChange() {
        notifyObserversTvState();
    }

    @Override
    public void notifyObserversChanelChange() {
        observers.forEach(o -> o.updateChanel(chanelNumber));
    }

    @Override
    public void notifyObserversTvState() {
        observers.forEach(o -> o.status(on));
    }
}
