package cours.StatePattern;

public class Context {
    private StateInterface onState;
    private StateInterface offState;
    private StateInterface currentState;

    public Context(){
        this.onState = new StateOn(this);
        this.offState = new StateOff(this);
        this.currentState = offState;
    }

    public void setState(StateInterface state){
        currentState = state;
    }

    public StateInterface getOnState() {
        return onState;
    }

    public void setOnState(StateInterface onState) {
        this.onState = onState;
    }

    public StateInterface getOffState() {
        return offState;
    }

    public void setOffState(StateInterface offState) {
        this.offState = offState;
    }

    public void on(){
        currentState.on();
    }

    public void off(){
        currentState.off();
    }
}
