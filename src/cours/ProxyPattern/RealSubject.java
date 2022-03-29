package cours.ProxyPattern;

public class RealSubject implements SubjectInterface{

    @Override
    public void request() {
        System.out.println("Do the real subject action.");
    }
}
