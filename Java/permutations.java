import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used;


    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums);


        return res;
    }

    private void backtrack(List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));

            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            list.add(nums[i]);
            used[i] = true;
            backtrack(list, nums);
            list.removeLast();
            used[i] = false;
        }

    }


}