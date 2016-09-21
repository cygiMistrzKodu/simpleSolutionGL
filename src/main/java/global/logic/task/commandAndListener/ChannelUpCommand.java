package global.logic.task.commandAndListener;


public class ChannelUpCommand implements Command {

    Tv tv;

    public ChannelUpCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.chanelUp();
    }
}
