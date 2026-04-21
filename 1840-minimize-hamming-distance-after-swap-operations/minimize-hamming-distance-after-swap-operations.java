import java.util.*;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;

        UnionFind uf = new UnionFind(n);

        // Step 1: connect indices
        for (int i = 0; i < allowedSwaps.length; i++) {
            uf.union(allowedSwaps[i][0], allowedSwaps[i][1]);
        }

        // Step 2: group indices
        HashMap<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int parent = uf.find(i);
            if (!groups.containsKey(parent)) {
                groups.put(parent, new ArrayList<>());
            }
            groups.get(parent).add(i);
        }

        int mismatch = 0;

        // Step 3: process each group
        for (int parent : groups.keySet()) {
            List<Integer> indices = groups.get(parent);

            HashMap<Integer, Integer> freq = new HashMap<>();

            // count source values
            for (int i = 0; i < indices.size(); i++) {
                int idx = indices.get(i);
                freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
            }

            // match with target
            for (int i = 0; i < indices.size(); i++) {
                int idx = indices.get(i);
                int val = target[idx];

                if (freq.containsKey(val) && freq.get(val) > 0) {
                    freq.put(val, freq.get(val) - 1);
                } else {
                    mismatch++;
                }
            }
        }

        return mismatch;
    }
}

// Union Find (DSU)
class UnionFind {
    int[] parent;

    UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }

    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa != pb) parent[pa] = pb;
    }
}