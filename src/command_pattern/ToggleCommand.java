package command_pattern;

public class ToggleCommand implements Command {

    private final Light _light;
    ToggleCommand(Light light){
        this._light = light;
    }

    @Override
    public void execute() {
        this._light.toggle();
    }
}
