package g2001_2100.s2029_stone_game_ix;

// #Medium #Array #Math #Greedy #Counting #Game_Theory
// #2022_05_25_Time_31_ms_(10.87%)_Space_114.5_MB_(65.22%)

public class Solution {
    private int[] stones;
    public boolean stoneGameIX(int[] stones) {
        this.stones = stones;
        int [] freq = new int[3];
        for (int i : stones) {
            if (i % 3 == 0) {
                freq[0]++;
            }
            else if (i % 3 == 1) {
                freq[1]++;
            }
            else {
                freq[2]++;
            }
        }
        boolean b1 = false;
        boolean b2 = false;
        int[] a = freq.clone();
        int[] b = freq.clone();
        if (a[1] > 0) {
            a[1]--;
            b1 = fun(a, 1);
        }
        if (b[2] > 0) {
            b[2]--;
            b2 = fun(b, 2);
        }
        return b1 || b2 ;
    }
    
    private boolean fun (int[] freq, int sum) {
        int n = stones.length;
        int i = 1;
        while (i < n) {
            if (i % 2 == 0) {
                if (sum % 3 == 1) {
                    if (freq[0] > 0) {
                        freq[0]--;
                    }
                    else if (freq[1] > 0) {
                        freq[1]--;
                        sum += 1;
                    } else {
                        return false;
                    }
                    
                } else if (sum % 3 == 2) {
                    if (freq[0] > 0) {
                        freq[0]--;
                    }
                    else if (freq[2] > 0) {
                        freq[2]--;
                        sum += 2;
                    }
                    else {
                        return false;
                    }
                }
                    
            } else {
                if (sum % 3 == 2) {
                    if (freq[0] > 0) {
                        freq[0]--;
                    }
                    else if (freq[2] > 0) {
                        freq[2]--;
                        sum += 2;
                    }
                    else {
                        return true;
                    }
                    
                } else if (sum % 3 == 1) {
                    if (freq[0] > 0) {
                        freq[0]--;
                    }
                    else if (freq[1] > 0) {
                        freq[1]--;
                        sum += 1;
                    } else {
                        return true;
                    }
                }
            }
            i++;
        }
        return false;
    }
}