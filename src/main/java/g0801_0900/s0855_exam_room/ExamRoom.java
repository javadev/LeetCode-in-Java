package g0801_0900.s0855_exam_room;

// #Medium #Design #Ordered_Set #2022_03_27_Time_19_ms_(74.01%)_Space_45.8_MB_(67.28%)

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExamRoom {
    private Map<Integer, Node> map = new HashMap<>();
    private Node head = new Node(-1, map);
    private Node tail = new Node(-1, map);
    private int n;

    public ExamRoom() {
        head.next = tail;
        tail.pre = head;
    }

    public ExamRoom(int n) {
        this();
        this.n = n;
    }

    public int seat() {
        int right = n - 1 - tail.pre.val;
        int left = head.next.val;
        int max = 0;
        int maxAt = -1;
        Node maxAtLeft = null;
        for (Node cur = tail.pre; cur != head && cur.pre != head; cur = cur.pre) {
            Node pre = cur.pre;
            int at = (cur.val + pre.val) / 2;
            int distance = at - pre.val;
            if (distance >= max) {
                maxAtLeft = pre;
                max = distance;
                maxAt = at;
            }
        }
        if (head.next == tail || left >= max && left >= right) {
            return new Node(0, map).insert(head);
        }
        if (right > max) {
            return new Node(n - 1, map).insert(tail.pre);
        }
        return new Node(maxAt, map).insert(Objects.requireNonNull(maxAtLeft));
    }

    public void leave(int p) {
        map.get(p).delete();
        map.remove(p);
    }
}
