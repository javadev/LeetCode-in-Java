package g2101_2200.s2166_design_bitset;

// #Medium #Array #Hash_Table #Design #2022_06_02_Time_81_ms_(73.38%)_Space_142_MB_(64.61%)

import java.util.Arrays;

public class Bitset {
    private boolean[] bits;
    private boolean[] flipped;
    private int sz;
    private int cnt;

    public Bitset(int size) {
        sz = size;
        bits = new boolean[size];
        flipped = new boolean[size];
        Arrays.fill(flipped, true);
    }

    public void fix(int idx) {
        if (!bits[idx]) {
            bits[idx] ^= true;
            flipped[idx] ^= true;
            cnt += 1;
        }
    }

    public void unfix(int idx) {
        if (bits[idx]) {
            bits[idx] ^= true;
            flipped[idx] ^= true;
            cnt -= 1;
        }
    }

    public void flip() {
        boolean[] tmp = bits;
        bits = flipped;
        flipped = tmp;
        cnt = sz - cnt;
    }

    public boolean all() {
        return cnt == sz;
    }

    public boolean one() {
        return cnt > 0;
    }

    public int count() {
        return cnt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean b : bits) {
            sb.append(b ? '1' : '0');
        }
        return sb.toString();
    }
}

/*
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */
