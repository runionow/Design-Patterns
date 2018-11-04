package command_pattern;

// Command, Invoker, ConcreteCommand, Receiver - Manage State and Macro Command
public class CommandPattern {
    public static void main(String[] args){
        Light light = new Light();
        Switch switch1 = new Switch();

        light.getState();

//        Command onCommand = new OnCommand(light);
        ToggleCommand toggle = new ToggleCommand(light);
        switch1.storeAndExecute(toggle);
        switch1.storeAndExecute(toggle);
        switch1.storeAndExecute(toggle);
        switch1.storeAndExecute(toggle);
        switch1.storeAndExecute(toggle);

        light.getState();
    }
}
