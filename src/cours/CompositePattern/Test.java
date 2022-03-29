package cours.CompositePattern;

public class Test {
    public static void main(String[] args) {
        Component root = setupTree();

        root.operation();

    }
    public static Component setupTree(){
        Component node1 = new Composite("Node 1");
        Component node2 = new Composite("Node 2");

        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");
        Component leaf4 = new Leaf("Leaf 4");

        node1.add(node2);
        node1.add(leaf3);
        node2.add(leaf1);
        node2.add(leaf2);
        node2.add(leaf4);

        return node1;
    }
}
