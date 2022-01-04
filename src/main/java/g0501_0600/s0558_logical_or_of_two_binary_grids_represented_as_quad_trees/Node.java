package g0501_0600.s0558_logical_or_of_two_binary_grids_represented_as_quad_trees;

@SuppressWarnings("java:S1104")
public class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
        // empty constructor
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
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
        String isLeafLocal = node.isLeaf ? "1" : "0";
        String valLocal = node.val ? "1" : "0";
        return "[" + isLeafLocal + "," + valLocal + "]";
    }
}
