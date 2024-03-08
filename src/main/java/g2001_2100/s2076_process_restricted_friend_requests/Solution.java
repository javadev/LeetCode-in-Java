package g2001_2100.s2076_process_restricted_friend_requests;

// #Hard #Graph #Union_Find #2022_05_29_Time_102_ms_(55.25%)_Space_54.4_MB_(55.25%)

public class Solution {
    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        // Check for each request whether it can cause conflict or not
        UnionFind uf = new UnionFind(n);
        boolean[] res = new boolean[requests.length];
        for (int i = 0; i < requests.length; i++) {
            int p1 = uf.findParent(requests[i][0]);
            int p2 = uf.findParent(requests[i][1]);
            if (p1 == p2) {
                res[i] = true;
                continue;
            }
            // Check whether the current request will violate any restriction or not
            boolean flag = true;
            for (int[] restrict : restrictions) {
                int r1 = uf.findParent(restrict[0]);
                int r2 = uf.findParent(restrict[1]);
                if ((r1 == p1 && r2 == p2) || (r1 == p2 && r2 == p1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res[i] = true;
                // Union
                uf.parent[p1] = p2;
            }
        }
        return res;
    }

    private static class UnionFind {
        int n;
        int[] parent;

        public UnionFind(int n) {
            this.n = n;
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int findParent(int user) {
            while (parent[user] != user) {
                parent[user] = parent[parent[user]];
                user = parent[user];
            }
            return user;
        }
    }
}
