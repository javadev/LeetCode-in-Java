package g0901_1000.s0919_complete_binary_tree_inserter;

// #Medium #Breadth_First_Search #Tree #Binary_Tree #Design

import com_github_leetcode.TreeNode;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CBTInserter {
    private final Queue<TreeNode> q;
    private final TreeNode head;

    public CBTInserter(TreeNode root) {
        this.q = new LinkedList<>();
        this.head = root;

        addToQueue();
    }

    private void addToQueue() {
        Queue<TreeNode> hlq = new LinkedList<>();
        hlq.add(this.head);
        while (!hlq.isEmpty()) {
            int size = hlq.size();
            while (size-- > 0) {
                TreeNode poll = hlq.poll();
                this.q.add(poll);
                if (Objects.requireNonNull(poll).left != null) {
                    hlq.add(poll.left);
                }
                if (poll.right != null) {
                    hlq.add(poll.right);
                }
            }
        }
    }

    public int insert(int val) {
        TreeNode nn = new TreeNode(val);
        deleteFullNode();
        TreeNode peek = q.peek();
        if (Objects.requireNonNull(peek).left == null) {
            peek.left = nn;

        } else {
            peek.right = nn;
        }
        this.q.add(nn);

        return peek.val;
    }

    private void deleteFullNode() {
        while (this.q.size() > 0) {
            TreeNode peek = this.q.peek();
            if (peek.left != null && peek.right != null) {
                TreeNode pop = this.q.poll();
            } else {
                break;
            }
        }
    }

    public TreeNode getRoot() {
        return this.head;
    }
}
