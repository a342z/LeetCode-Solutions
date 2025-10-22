import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowMap = new HashMap<>();
        int n = grid.length;

        for (int[] row : grid) {
            List<Integer> key = new ArrayList<>();
            for (int val : row) key.add(val);
            rowMap.put(key, rowMap.getOrDefault(key, 0) + 1);
        }

        int res = 0;

        for (int j = 0; j < n; j++) {
            List<Integer> colKey = new ArrayList<>();
            for (int i = 0; i < n; i++) colKey.add(grid[i][j]);
            res += rowMap.getOrDefault(colKey, 0);
        }

        return res;
    }


}