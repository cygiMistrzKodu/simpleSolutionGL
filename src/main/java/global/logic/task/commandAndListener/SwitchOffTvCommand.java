package global.logic.task.commandAndListener;


public class SwitchOffTvCommand implements Command {

    Tv tv;

    public SwitchOffTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchOff();
    }
}
