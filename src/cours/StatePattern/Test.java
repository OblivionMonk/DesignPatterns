package cours.StatePattern;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        context.off();
        context.on();
        context.on();
        context.off();
    }
}
