package g0401_0500.s0427_construct_quad_tree;

@SuppressWarnings("java:S1104")
public class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(
            boolean val,
            boolean isLeaf,
            Node topLeft,
            Node topRight,
            Node bottomLeft,
            Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return getNode(this)
                + getNode(topLeft)
                + getNode(topRight)
                + getNode(bottomLeft)
                + getNode(bottomRight);
    }

    private String getNode(Node node) {
        return "[" + (node.isLeaf ? "1" : "0") + "," + (node.val ? "1" : "0") + "]";
    }
}
