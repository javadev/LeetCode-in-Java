package g3501_3600.s3509_maximum_product_of_subsequences_with_an_alternating_sum_equal_to_k;

// #Hard #2025_04_06_Time_142_ms_(100.00%)_Space_46.26_MB_(93.55%)

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S6541")
public class Solution {
    static class StateKey {
        int prod;
        int parity;

        StateKey(int prod, int parity) {
            this.prod = prod;
            this.parity = parity;
        }

        @Override
        public int hashCode() {
            return prod * 31 + parity;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof StateKey)) {
                return false;
            }
            StateKey other = (StateKey) obj;
            return this.prod == other.prod && this.parity == other.parity;
        }
    }

    private static BitSet shift(BitSet bs, int shiftVal, int size) {
        BitSet res = new BitSet(size);
        if (shiftVal >= 0) {
            for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
                int newIdx = i + shiftVal;
                if (newIdx < size) {
                    res.set(newIdx);
                }
            }
        } else {
            int shiftRight = -shiftVal;
            for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
                int newIdx = i - shiftRight;
                if (newIdx >= 0) {
                    res.set(newIdx);
                }
            }
        }
        return res;
    }

    public int maxProduct(int[] nums, int k, int limit) {
        int[] melkarvothi = nums.clone();
        int offset = 1000;
        int size = 2100;
        Map<StateKey, BitSet> dp = new HashMap<>();
        for (int x : melkarvothi) {
            Map<StateKey, BitSet> newStates = new HashMap<>();
            for (Map.Entry<StateKey, BitSet> entry : dp.entrySet()) {
                StateKey key = entry.getKey();
                int currentProd = key.prod;
                int newProd;
                if (x == 0) {
                    newProd = 0;
                } else {
                    if (currentProd == 0) {
                        newProd = 0;
                    } else if (currentProd == -1) {
                        newProd = -1;
                    } else {
                        long mult = (long) currentProd * x;
                        if (mult > limit) {
                            newProd = -1;
                        } else {
                            newProd = (int) mult;
                        }
                    }
                }
                int newParity = 1 - key.parity;
                BitSet bs = entry.getValue();
                BitSet shifted;
                if (key.parity == 0) {
                    shifted = shift(bs, x, size);
                } else {
                    shifted = shift(bs, -x, size);
                }
                StateKey newKey = new StateKey(newProd, newParity);
                BitSet current = newStates.get(newKey);
                if (current == null) {
                    current = new BitSet(size);
                    newStates.put(newKey, current);
                }
                current.or(shifted);
            }
            if (x == 0 || x <= limit) {
                int parityStart = 1;
                StateKey newKey = new StateKey(x, parityStart);
                BitSet bs = newStates.get(newKey);
                if (bs == null) {
                    bs = new BitSet(size);
                    newStates.put(newKey, bs);
                }
                int pos = x + offset;
                if (pos >= 0 && pos < size) {
                    bs.set(pos);
                }
            }
            for (Map.Entry<StateKey, BitSet> entry : newStates.entrySet()) {
                StateKey key = entry.getKey();
                BitSet newBS = entry.getValue();
                BitSet oldBS = dp.get(key);
                if (oldBS == null) {
                    dp.put(key, newBS);
                } else {
                    oldBS.or(newBS);
                }
            }
        }
        int answer = -1;
        int targetIdx = k + offset;
        for (Map.Entry<StateKey, BitSet> entry : dp.entrySet()) {
            StateKey key = entry.getKey();
            if (key.prod == -1) {
                continue;
            }
            BitSet bs = entry.getValue();
            if (targetIdx >= 0 && targetIdx < size && bs.get(targetIdx)) {
                answer = Math.max(answer, key.prod);
            }
        }
        return answer;
    }
}
