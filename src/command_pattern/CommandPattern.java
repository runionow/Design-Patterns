package command_pattern;


public class CommandPattern {
    public static void main(String[] args){
        Light light = new Light();
        Switch switch1 = new Switch();

        light.getState();

        Command onCommand = new OnCommand(light);
        switch1.storeAndExecute(onCommand);

        light.getState();
    }
}
