package cours.SingletonPattern;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getDescription();
    }
}
