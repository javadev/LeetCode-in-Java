package g2501_2600.s2502_design_memory_allocator;

// #Medium #Array #Hash_Table #Design #Simulation
// #2023_03_19_Time_9_ms_(100.00%)_Space_43_MB_(66.82%)

public class Allocator {
    Node root;

    public Allocator(int n) {
        root = new Node(0, n, -1);
    }

    public int allocate(int size, int mID) {
        Node cur = root;
        while (cur != null && (cur.size < size || cur.id != -1)) {
            cur = cur.next;
        }
        // unable to allocate
        if (cur == null) {
            return -1;
        }
        if (cur.size == size) {
            cur.id = mID;
            return cur.ind;
        } else {
            Node n = new Node(cur.ind + size, cur.size - size, -1);
            n.next = cur.next;
            cur.next = n;
            cur.size = size;
            cur.id = mID;
            return cur.ind;
        }
    }

    public int free(int mID) {
        return collapse(root, mID);
    }

    public int collapse(Node cur, int id) {
        // base case
        if (cur == null) {
            return 0;
        }
        // include size if matching id
        int res = cur.id == id ? cur.size : 0;
        // recurse on child
        res += collapse(cur.next, id);
        // unallocate
        if (cur.id == id) {
            cur.id = -1;
        }
        // collapse unallocated adjacent nodes
        while (cur.next != null && cur.next.id == -1 && cur.id == -1) {
            cur.size += cur.next.size;
            cur.next = cur.next.next;
        }
        return res;
    }

    private static class Node {
        int ind;
        Node next;
        int size;
        int id;

        public Node(int i, int sz, int mID) {
            ind = i;
            size = sz;
            id = mID;
        }
    }
}

/*
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */
