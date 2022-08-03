package g0501_0600.s0558_logical_or_of_two_binary_grids_represented_as_quad_trees;

// #Medium #Tree #Divide_and_Conquer #2022_08_03_Time_0_ms_(100.00%)_Space_53.7_MB_(67.05%)

/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
public class Solution {
    public Node intersect(Node n1, Node n2) {
        if (n1.isLeaf) {
            return n1.val ? n1 : n2;
        }
        if (n2.isLeaf) {
            return n2.val ? n2 : n1;
        }
        Node out = new Node();
        Node tl;
        Node tr;
        Node bl;
        Node br;
        tl = intersect(n1.topLeft, n2.topLeft);
        tr = intersect(n1.topRight, n2.topRight);
        bl = intersect(n1.bottomLeft, n2.bottomLeft);
        br = intersect(n1.bottomRight, n2.bottomRight);
        if (tl.isLeaf
                && tr.isLeaf
                && bl.isLeaf
                && br.isLeaf
                && (tl.val == tr.val)
                && (tr.val == bl.val)
                && (br.val == bl.val)) {
            out.isLeaf = true;
            out.val = tl.val;
        } else {
            out.topLeft = tl;
            out.topRight = tr;
            out.bottomLeft = bl;
            out.bottomRight = br;
        }
        return out;
    }
}
