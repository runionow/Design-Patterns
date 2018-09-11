package command_pattern;

public class Light {

    private int _state;

    public Light(){
        // Initial state is set to Off.
        this._state = 0;
    }

    public void on(){
        if(this._state == 0){
            this._state = 1;
        }
    }
    public void off(){
        if(this._state == 1){
            this._state = 0;
        }
    }
    public int getState(){
        System.out.println("Current State : " + this._state);
        return this._state;
    }

}
