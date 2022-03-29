package cours.CommandPattern;

public class Invoker {
    Command slot;

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
