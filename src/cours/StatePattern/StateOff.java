package cours.StatePattern;

public class StateOff implements StateInterface {
    Context context;

    public StateOff(Context context) {
        this.context = context;
    }

    @Override
    public void on() {
        context.setState(context.getOnState());
        System.out.println("State is now on");
    }

    @Override
    public void off() {
        System.out.println("State is already off");
    }
}
