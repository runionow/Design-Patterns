package command_pattern;

public class Switch {
    public void storeAndExecute(Command command){
        command.execute();
    }
}
