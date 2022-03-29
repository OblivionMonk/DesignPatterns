package cours.CommandPattern;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.buttonPressed();
    }
}
