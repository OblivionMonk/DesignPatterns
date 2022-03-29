package cours.ProxyPattern;

public class Client {
    public static void main(String[] args) {
        SubjectInterface subject = new Proxy();
        subject.request();
    }
}
