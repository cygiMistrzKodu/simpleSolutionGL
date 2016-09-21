package global.logic.task.commandAndListener;


public class SwitchOnTvCommand implements Command {

    Tv tv;

    public SwitchOnTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchOn();
    }
}
