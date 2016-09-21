package global.logic.task.commandAndListener;


public class ChannelDownCommand implements Command {

    Tv tv;

    public ChannelDownCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {

        tv.chanelDown();
    }
}
