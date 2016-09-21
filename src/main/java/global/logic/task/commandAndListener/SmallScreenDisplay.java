package global.logic.task.commandAndListener;

public class SmallScreenDisplay implements Observer {
    @Override
    public void updateChanel(int channel) {
        System.out.println("Channel: "+ channel);
    }

    @Override
    public void status(Boolean status) {

        System.out.println("Tv is on: "+ status);
    }
}
