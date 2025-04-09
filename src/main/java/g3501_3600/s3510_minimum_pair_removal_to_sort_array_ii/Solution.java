package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii;

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Simulation #Linked_List #Ordered_Set
// #Doubly_Linked_List #2025_04_09_Time_492_ms_(98.32%)_Space_62.71_MB_(97.48%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S127")
public class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        LST lst = new LST(n);
        lst.setRange(n);
        int dec = 0;
        long[] a = new long[nums.length];
        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                dec++;
            }
        }
        MinHeapL h = new MinHeapL(n);
        for (int i = 0; i < n - 1; i++) {
            h.add(i, (a[i + 1] + a[i]), i);
        }
        int step = 0;
        while (dec > 0) {
            step++;
            int arg = h.argmin();
            h.remove(arg);
            int r = lst.next(arg + 1);
            assert r != -1;
            h.remove(r);
            int ll = lst.prev(arg - 1);
            int rr = lst.next(r + 1);
            if (a[arg] > a[r]) {
                dec--;
            }
            if (ll >= 0 && a[ll] > a[arg]) {
                dec--;
            }
            if (rr != -1 && a[r] > a[rr]) {
                dec--;
            }
            a[arg] += a[r];
            a[r] = 0;
            lst.unset(r);
            if (ll >= 0) {
                if (a[ll] > a[arg]) {
                    dec++;
                }
                h.update(ll, (a[ll] + a[arg]), ll);
            }
            if (rr != -1) {
                if (a[arg] > a[rr]) {
                    dec++;
                }
                h.update(arg, (a[arg] + a[rr]), arg);
            }
        }
        return step;
    }

    public static class MinHeapL {
        static final long INF = Long.MAX_VALUE;

        long[] hi;
        long[] lo;
        int[] map;
        int[] imap;
        int n;
        int pos;

        public MinHeapL(int m) {
            n = Integer.highestOneBit((m + 1) << 1);
            hi = new long[n];
            lo = new long[n];
            map = new int[n];
            imap = new int[n];
            Arrays.fill(hi, INF);
            Arrays.fill(lo, INF);
            Arrays.fill(map, -1);
            Arrays.fill(imap, -1);
            pos = 1;
        }

        public void add(int ind, long hiValue, long loValue) {
            if (imap[ind] < 0) {
                hi[pos] = hiValue;
                lo[pos] = loValue;
                map[pos] = ind;
                imap[ind] = pos;
                pos++;
                up(pos - 1);
            }
        }

        public void update(int ind, long hiValue, long loValue) {
            if (imap[ind] < 0) {
                hi[pos] = hiValue;
                lo[pos] = loValue;
                map[pos] = ind;
                imap[ind] = pos;
                pos++;
                up(pos - 1);
            } else {
                int p = imap[ind];
                hi[p] = hiValue;
                lo[p] = loValue;
                up(p);
                down(p);
            }
        }

        public long remove(int ind) {
            if (pos == 1) {
                return INF;
            }
            if (imap[ind] == -1) {
                return INF;
            }
            int rem = imap[ind];
            long ret = hi[rem];
            pos--;
            hi[rem] = hi[pos];
            lo[rem] = lo[pos];
            int movedInd = map[pos];
            map[rem] = movedInd;
            imap[movedInd] = rem;
            hi[pos] = INF;
            lo[pos] = INF;
            map[pos] = -1;
            imap[ind] = -1;
            up(rem);
            down(rem);
            return ret;
        }

        public long min() {
            return hi[1];
        }

        public int argmin() {
            return map[1];
        }

        public int size() {
            return pos - 1;
        }

        public long get(int ind) {
            return hi[imap[ind]];
        }

        private void up(int cur) {
            for (int c = cur, p = c >>> 1; p >= 1; c = p, p = c >>> 1) {
                if (compare(p, c) > 0) {
                    swap(p, c);
                } else {
                    break;
                }
            }
        }

        private void down(int cur) {
            for (int c = cur; 2 * c < pos; ) {
                int child = 2 * c;
                if (child + 1 < pos && compare(child, child + 1) > 0) {
                    child++;
                }
                if (compare(c, child) > 0) {
                    swap(c, child);
                    c = child;
                } else {
                    break;
                }
            }
        }

        private int compare(int i, int j) {
            if (hi[i] != hi[j]) {
                return Long.compare(hi[i], hi[j]);
            } else {
                return Long.compare(lo[i], lo[j]);
            }
        }

        private void swap(int i, int j) {
            long tmpHi = hi[i];
            hi[i] = hi[j];
            hi[j] = tmpHi;
            long tmpLo = lo[i];
            lo[i] = lo[j];
            lo[j] = tmpLo;
            int tmpMap = map[i];
            map[i] = map[j];
            map[j] = tmpMap;
            imap[map[i]] = i;
            imap[map[j]] = j;
        }
    }

    private static class LST {
        long[][] set;
        int n;

        public LST(int n) {
            this.n = n;
            int d = 1;
            for (int m = n; m > 1; m >>>= 6, d++) {}

            set = new long[d][];
            for (int i = 0, m = n >>> 6; i < d; i++, m >>>= 6) {
                set[i] = new long[m + 1];
            }
        }

        public void setRange(int r) {
            for (int i = 0; i < set.length; i++, r = r + 63 >>> 6) {
                for (int j = 0; j < r >>> 6; j++) {
                    set[i][j] = -1L;
                }
                if ((r & 63) != 0) {
                    set[i][r >>> 6] |= (1L << r) - 1;
                }
            }
        }

        public void unset(int pos) {
            if (pos >= 0 && pos < n) {
                for (int i = 0;
                        i < set.length && (i == 0 || set[i - 1][pos] == 0L);
                        i++, pos >>>= 6) {
                    set[i][pos >>> 6] &= ~(1L << pos);
                }
            }
        }

        public int prev(int pos) {
            for (int i = 0; i < set.length && pos >= 0; i++, pos >>>= 6, pos--) {
                int pre = prevValue(set[i][pos >>> 6], pos & 63);
                if (pre != -1) {
                    pos = pos >>> 6 << 6 | pre;
                    while (i > 0) {
                        pos = pos << 6 | 63 - Long.numberOfLeadingZeros(set[--i][pos]);
                    }
                    return pos;
                }
            }
            return -1;
        }

        public int next(int pos) {
            for (int i = 0; i < set.length && pos >>> 6 < set[i].length; i++, pos >>>= 6, pos++) {
                int nex = nextValue(set[i][pos >>> 6], pos & 63);
                if (nex != -1) {
                    pos = pos >>> 6 << 6 | nex;
                    while (i > 0) {
                        pos = pos << 6 | Long.numberOfTrailingZeros(set[--i][pos]);
                    }
                    return pos;
                }
            }
            return -1;
        }

        private int prevValue(long set, int n) {
            long h = set << ~n;
            if (h == 0L) {
                return -1;
            }
            return -Long.numberOfLeadingZeros(h) + n;
        }

        private int nextValue(long set, int n) {
            long h = set >>> n;
            if (h == 0L) {
                return -1;
            }
            return Long.numberOfTrailingZeros(h) + n;
        }

        @Override
        public String toString() {
            List<Integer> list = new ArrayList<>();
            for (int pos = next(0); pos != -1; pos = next(pos + 1)) {
                list.add(pos);
            }
            return list.toString();
        }
    }
}
