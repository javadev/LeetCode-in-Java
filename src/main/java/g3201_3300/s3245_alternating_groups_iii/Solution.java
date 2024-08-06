package g3201_3300.s3245_alternating_groups_iii;

// #Hard #Array #Binary_Indexed_Tree #2024_08_06_Time_36_ms_(82.22%)_Space_70.3_MB_(97.78%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void go(int ind, LST lst, int[] fs, int n, LST ff, int[] c) {
        if (ind > 0) {
            int pre = lst.prev(ind - 1);
            int nex = lst.next(pre + 1);
            if (nex == -1) {
                nex = 2 * n;
            }
            if (pre != -1 && pre < n && --fs[nex - pre] == 0) {
                ff.unsetPos(nex - pre);
            }
        }
        if (lst.get(ind)) {
            int pre = ind;
            int nex = lst.next(ind + 1);
            if (nex == -1) {
                nex = 2 * n;
            }
            if (pre != -1 && pre < n && --fs[nex - pre] == 0) {
                ff.unsetPos(nex - pre);
            }
        }
        if (lst.get(ind + 1)) {
            int pre = ind + 1;
            int nex = lst.next(ind + 2);
            if (nex == -1) {
                nex = 2 * n;
            }
            if (pre != -1 && pre < n && --fs[nex - pre] == 0) {
                ff.unsetPos(nex - pre);
            }
        }
        lst.unsetPos(ind);
        lst.unsetPos(ind + 1);
        c[ind] ^= 1;
        if (ind > 0 && c[ind] != c[ind - 1]) {
            lst.setPos(ind);
        }
        if (ind + 1 < c.length && c[ind + 1] != c[ind]) {
            lst.setPos(ind + 1);
        }
        if (ind > 0) {
            int pre = lst.prev(ind - 1);
            int nex = lst.next(pre + 1);
            if (nex == -1) {
                nex = 2 * n;
            }
            if (pre != -1 && pre < n && ++fs[nex - pre] == 1) {
                ff.setPos(nex - pre);
            }
        }
        if (lst.get(ind)) {
            int pre = ind;
            int nex = lst.next(ind + 1);
            if (nex == -1) {
                nex = 2 * n;
            }
            if (pre < n && ++fs[nex - pre] == 1) {
                ff.setPos(nex - pre);
            }
        }
        if (lst.get(ind + 1)) {
            int pre = ind + 1;
            int nex = lst.next(ind + 2);
            if (nex == -1) {
                nex = 2 * n;
            }
            if (pre < n && ++fs[nex - pre] == 1) {
                ff.setPos(nex - pre);
            }
        }
    }

    public List<Integer> numberOfAlternatingGroups(int[] colors, int[][] queries) {
        int n = colors.length;
        int[] c = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            c[i] = colors[i % n] ^ (i % 2 == 0 ? 0 : 1);
        }
        LST lst = new LST(2 * n + 3);
        for (int i = 1; i < 2 * n; i++) {
            if (c[i] != c[i - 1]) {
                lst.setPos(i);
            }
        }
        int[] fs = new int[2 * n + 1];
        LST ff = new LST(2 * n + 1);
        for (int i = 0; i < n; i++) {
            if (lst.get(i)) {
                int ne = lst.next(i + 1);
                if (ne == -1) {
                    ne = 2 * n;
                }
                fs[ne - i]++;
                ff.setPos(ne - i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int[] q : queries) {
            if (q[0] == 1) {
                if (lst.next(0) == -1) {
                    ans.add(n);
                } else {
                    int lans = 0;
                    for (int i = ff.next(q[1]); i != -1; i = ff.next(i + 1)) {
                        lans += (i - q[1] + 1) * fs[i];
                    }
                    if (c[2 * n - 1] != c[0]) {
                        int f = lst.next(0);
                        if (f >= q[1]) {
                            lans += (f - q[1] + 1);
                        }
                    }
                    ans.add(lans);
                }
            } else {
                int ind = q[1];
                int val = q[2];
                if (colors[ind] == val) {
                    continue;
                }
                colors[ind] ^= 1;
                go(ind, lst, fs, n, ff, c);
                go(ind + n, lst, fs, n, ff, c);
            }
        }
        return ans;
    }

    private static class LST {
        private long[][] set;
        private int n;

        public LST(int n) {
            this.n = n;
            int d = 1;
            d = getD(n, d);
            set = new long[d][];
            for (int i = 0, m = n >>> 6; i < d; i++, m >>>= 6) {
                set[i] = new long[m + 1];
            }
        }

        private int getD(int n, int d) {
            int m = n;
            while (m > 1) {
                m >>>= 6;
                d++;
            }
            return d;
        }

        public LST setPos(int pos) {
            if (pos >= 0 && pos < n) {
                for (int i = 0; i < set.length; i++, pos >>>= 6) {
                    set[i][pos >>> 6] |= 1L << pos;
                }
            }
            return this;
        }

        public LST unsetPos(int pos) {
            if (pos >= 0 && pos < n) {
                for (int i = 0;
                        i < set.length && (i == 0 || set[i - 1][pos] == 0L);
                        i++, pos >>>= 6) {
                    set[i][pos >>> 6] &= ~(1L << pos);
                }
            }
            return this;
        }

        public boolean get(int pos) {
            return pos >= 0 && pos < n && set[0][pos >>> 6] << ~pos < 0;
        }

        public int prev(int pos) {
            int i = 0;
            while (i < set.length && pos >= 0) {
                int pre = prev(set[i][pos >>> 6], pos & 63);
                if (pre != -1) {
                    pos = pos >>> 6 << 6 | pre;
                    while (i > 0) {
                        pos = pos << 6 | 63 - Long.numberOfLeadingZeros(set[--i][pos]);
                    }
                    return pos;
                }
                i++;
                pos >>>= 6;
                pos--;
            }
            return -1;
        }

        private int prev(long set, int n) {
            long h = set << ~n;
            if (h == 0L) {
                return -1;
            }
            return -Long.numberOfLeadingZeros(h) + n;
        }

        public int next(int pos) {
            int i = 0;
            while (i < set.length && pos >>> 6 < set[i].length) {
                int nex = next(set[i][pos >>> 6], pos & 63);
                if (nex != -1) {
                    pos = pos >>> 6 << 6 | nex;
                    while (i > 0) {
                        pos = pos << 6 | Long.numberOfTrailingZeros(set[--i][pos]);
                    }
                    return pos;
                }
                i++;
                pos >>>= 6;
                pos++;
            }
            return -1;
        }

        private static int next(long set, int n) {
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
