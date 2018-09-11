package command_pattern;

public class OnCommand implements Command {

    private Light _obj;

    OnCommand(Light obj){
            this._obj = obj;
    }

    @Override
    public void execute() {
        this._obj.on();
    }
}
