package g0701_0800.s0753_cracking_the_safe;

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2022_03_25_Time_4_ms_(96.44%)_Space_41.7_MB_(94.37%)

public class Solution {
    private String foundStr;

    public String crackSafe(int n, int k) {
        int targetCnt = (int) Math.pow(k, n);
        boolean[] visited = new boolean[(int) Math.pow(10, n)];
        visited[0] = true;
        int visitedCnt = 1;
        StringBuilder crackStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            crackStr.append('0');
        }
        dfsAddPwd(n, k, crackStr, 0, visited, visitedCnt, targetCnt);
        return foundStr;
    }

    private void dfsAddPwd(
            int n,
            int k,
            StringBuilder crackStr,
            int prev,
            boolean[] visited,
            int visitedCnt,
            int targetCnt) {
        if (foundStr != null) {
            return;
        }
        if (visitedCnt == targetCnt) {
            foundStr = crackStr.toString();
            return;
        }
        int root = 10 * prev % ((int) Math.pow(10, n));
        for (int i = 0; i < k; i++) {
            int current = root + i;
            if (!visited[current]) {
                crackStr.append(i);
                visited[current] = true;
                dfsAddPwd(n, k, crackStr, current, visited, visitedCnt + 1, targetCnt);
                crackStr.setLength(crackStr.length() - 1);
                visited[current] = false;
            }
        }
    }
}
