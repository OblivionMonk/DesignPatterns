package cours.ProxyPattern;

public class Proxy implements SubjectInterface{

    private RealSubject realSubject;

    @Override
    public void request() {
        System.out.println("Proxy does som preliminary work and check");
        this.realSubject = new RealSubject();
        realSubject.request();
    }
}
