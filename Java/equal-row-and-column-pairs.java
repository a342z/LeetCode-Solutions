import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                sb1.append(grid[i][j] + ".");
                sb2.append(grid[j][i] + ".");

            }
            map1.put(sb1.toString(), map1.getOrDefault(sb1.toString(), 0) + 1);
            map2.put(sb2.toString(), map2.getOrDefault(sb2.toString(), 0) + 1);
        }

        for (var m : map1.entrySet()) {
            res += map1.getOrDefault(m.getKey(), 0) * map2.getOrDefault(m.getKey(), 0);

        }

        return res;
    }


}