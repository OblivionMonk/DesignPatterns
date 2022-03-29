package cours.CompositePattern2;

public class Leaf implements Component{

    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}
