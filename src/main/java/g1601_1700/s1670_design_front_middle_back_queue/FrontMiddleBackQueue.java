package g1601_1700.s1670_design_front_middle_back_queue;

// #Medium #Array #Design #Linked_List #Queue #Data_Stream
// #2022_04_22_Time_5_ms_(100.00%)_Space_42.8_MB_(84.98%)

public class FrontMiddleBackQueue {
    private int[] queue = new int[1000];
    private int cur = -1;

    public FrontMiddleBackQueue() {
        // empty constructor
    }

    public void pushFront(int val) {
        cur++;
        for (int i = cur; i > 0; i--) {
            queue[i] = queue[i - 1];
        }
        queue[0] = val;
    }

    public void pushMiddle(int val) {
        if (cur < 0) {
            pushFront(val);
            return;
        }
        cur++;
        int mid = cur / 2;
        for (int i = cur; i > mid; i--) {
            queue[i] = queue[i - 1];
        }
        queue[mid] = val;
    }

    public void pushBack(int val) {
        if (cur < 0) {
            pushFront(val);
            return;
        }
        cur++;
        queue[cur] = val;
    }

    public int popFront() {
        if (cur < 0) {
            return -1;
        }
        int result = queue[0];
        for (int i = 0; i < cur; i++) {
            queue[i] = queue[i + 1];
        }
        cur--;
        return result;
    }

    public int popMiddle() {
        if (cur < 0) {
            return -1;
        }
        int mid = cur / 2;
        int result = queue[mid];
        for (int i = mid; i < cur; i++) {
            queue[i] = queue[i + 1];
        }
        cur--;
        return result;
    }

    public int popBack() {
        if (cur < 0) {
            return -1;
        }
        int result = queue[cur];
        cur--;
        return result;
    }
}

/*
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
