package cours.ObserverPattern;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);

        subject.setState(80);
        subject.setState(120);
        subject.setState(10);
        subject.setState(1000);
        subject.setState(1);
        subject.setState(101);
    }
}
