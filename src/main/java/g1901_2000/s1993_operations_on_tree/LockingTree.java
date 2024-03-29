package g1901_2000.s1993_operations_on_tree;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Design
// #2024_03_29_Time_58_ms_(99.38%)_Space_47.6_MB_(83.13%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class LockingTree {
    private List<Integer>[] graph;
    private boolean[] locked;
    private int[] parent;
    private int[] users;
    private int[] control;

    public LockingTree(int[] parent) {
        int n = parent.length;
        this.parent = parent;
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            graph[parent[i]].add(i);
        }
        locked = new boolean[n];
        users = new int[n];
        control = new int[n];
    }

    private void setLock(int id, int user) {
        locked[id] = true;
        users[id] = user;
    }

    private void subNodeUnlock(int id) {
        for (int child : graph[id]) {
            locked[child] = false;
            if (control[child] <= 0) {
                continue;
            }
            control[child] = 0;
            subNodeUnlock(child);
        }
    }

    public boolean lock(int id, int user) {
        if (locked[id]) {
            return false;
        }
        setLock(id, user);
        if (control[id] == 0) {
            int node = parent[id];
            while (node != -1) {
                control[node]++;
                if (locked[node] || control[node] > 1) {
                    break;
                }
                node = parent[node];
            }
        }
        return true;
    }

    public boolean unlock(int id, int user) {
        if (!locked[id] || users[id] != user) {
            return false;
        }
        locked[id] = false;
        if (control[id] == 0) {
            int node = parent[id];
            while (node != -1) {
                control[node]--;
                if (locked[node] || control[node] >= 1) {
                    break;
                }
                node = parent[node];
            }
        }
        return true;
    }

    public boolean upgrade(int id, int user) {
        if (locked[id] || control[id] == 0) {
            return false;
        }
        int cur = parent[id];
        while (cur != -1) {
            if (locked[cur]) {
                return false;
            }
            cur = parent[cur];
        }
        setLock(id, user);
        if (control[id] > 0) {
            control[id] = 0;
            subNodeUnlock(id);
        }
        return true;
    }
}

/*
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */
