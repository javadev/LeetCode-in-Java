package g0701_0800.s0715_range_module;

// #Hard #Design #Ordered_Set #Segment_Tree #2022_03_24_Time_35_ms_(98.62%)_Space_50_MB_(97.66%)

public class RangeModule {
    private final Interval head;

    public RangeModule() {
        head = new Interval(0, 0);
    }

    public void addRange(int left, int right) {
        Interval pos = head;
        while (pos.next != null && pos.next.end < left) {
            pos = pos.next;
        }
        while (pos.next != null && pos.next.start <= right) {
            left = Math.min(pos.next.start, left);
            right = Math.max(pos.next.end, right);
            removeNext(pos);
        }
        insert(pos, new Interval(left, right));
    }

    public boolean queryRange(int left, int right) {
        Interval pos = head;
        while (pos != null) {
            if (left >= pos.start && right <= pos.end) {
                return true;
            }
            pos = pos.next;
        }
        return false;
    }

    public void removeRange(int left, int right) {
        Interval pos = head;
        while (pos.next != null && pos.next.end <= left) {
            pos = pos.next;
        }
        Interval prev = pos;
        Interval curr = pos.next;
        while (curr != null && curr.start < right) {
            if (curr.start < left) {
                insert(prev, new Interval(curr.start, left));
                curr.start = left;
                prev = prev.next;
                curr = prev.next;
                continue;
            }
            if (right >= curr.end) {
                removeNext(prev);
                curr = prev.next;
            } else {
                curr.start = right;
                curr = curr.next;
            }
        }
    }

    private void insert(Interval curr, Interval next) {
        next.next = curr.next;
        curr.next = next;
    }

    private void removeNext(Interval curr) {
        Interval del = curr.next;
        if (del != null) {
            curr.next = del.next;
            del.next = null;
        }
    }

    static class Interval {
        int start;
        int end;
        Interval next;

        public Interval(int l, int r) {
            start = l;
            end = r;
        }
    }
}
