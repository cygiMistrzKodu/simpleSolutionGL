package global.logic.task.commandAndListener;

public class TvLooker {

    public static void main(String[] args)    {

        RemoteController remoteController = new RemoteController();
        Tv tv = new Tv();
        tv.registerObserver(new SmallScreenDisplay());


        Command tvOn = new SwitchOnTvCommand(tv);
        Command channelUP = new ChannelUpCommand(tv);
        Command channelDown = new ChannelDownCommand(tv);
        Command tvOff  = new SwitchOffTvCommand(tv);

        remoteController.setCommand(tvOn);
        remoteController.pressButton();

        remoteController.setCommand(channelUP);
        remoteController.pressButton();
        remoteController.pressButton();
        remoteController.pressButton();
        remoteController.pressButton();

        remoteController.setCommand(channelDown);
        remoteController.pressButton();
        remoteController.pressButton();
        remoteController.pressButton();

        remoteController.setCommand(tvOff);
        remoteController.pressButton();


    }
}
