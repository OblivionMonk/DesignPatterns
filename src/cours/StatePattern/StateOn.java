package cours.StatePattern;

public class StateOn implements StateInterface {
    Context context;

    public StateOn(Context context) {
        this.context = context;
    }

    @Override
    public void on() {
        System.out.println("State is already on");
    }

    @Override
    public void off() {
        context.setState(context.getOffState());
        System.out.println("State is now off");
    }
}
