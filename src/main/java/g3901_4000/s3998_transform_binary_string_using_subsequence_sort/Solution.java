package g3901_4000.s3998_transform_binary_string_using_subsequence_sort;

// #Medium #Array #String #Greedy #Two_Pointers #Staff #Weekly_Contest_511
// #2026_11_17_Time_25_ms_(100.00%)_Space_85.98_MB_(6.45%)

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int len = strs.length;
        int[] count = new int[2];
        for (char ch : s.toCharArray()) {
            count[ch - '0']++;
        }
        // create lists of all those tasks, which are no blocking main thread
        List<CompletableFuture<Boolean>> listOfFutureTasks = new ArrayList<>();
        for (String target : strs) {
            listOfFutureTasks.add(canConvert(s, target, count));
        }
        // allOf will make sure all things are running concurrently/parallely while .join() can be
        // used to complete em all
        CompletableFuture<Void> allDone =
                CompletableFuture.allOf(listOfFutureTasks.toArray(new CompletableFuture[0]));
        // collect results when allDone is complete
        boolean[] res = new boolean[len];
        allDone.thenRun(
                        () -> {
                            for (int i = 0; i < len; i++) {
                                res[i] = listOfFutureTasks.get(i).join();
                            }
                        })
                .join();
        return res;
    }

    private CompletableFuture<Boolean> canConvert(String src, String target, int[] count) {
        // first check there should be equal or less number of 1's and 0's
        return CompletableFuture.supplyAsync(() -> validateBalance(target, count))
                .thenApply(dst -> dst != null && isPossibleToConvert(src, dst));
    }

    private boolean isPossibleToConvert(String src, String dst) {
        int n = src.length();
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (src.charAt(i) == '0') {
                zero++;
            }
            if (dst.charAt(i) == '0') {
                zero--;
            }
            if (zero > 0) {
                return false;
            }
        }
        return true;
    }

    private String validateBalance(String s, int[] count) {
        int[] local = new int[2];
        for (char ch : s.toCharArray()) {
            if (ch == '?') {
                continue;
            }
            local[ch - '0']++;
        }
        if (local[0] > count[0] || local[1] > count[1]) {
            return null;
        }
        int diff0 = count[0] - local[0];
        int diff1 = count[1] - local[1];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '?') {
                if (diff0-- > 0) {
                    sb.append('0');
                } else if (diff1-- > 0) {
                    sb.append('1');
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
