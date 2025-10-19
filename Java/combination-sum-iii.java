class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(res, new ArrayList<>(),0, n, k, 1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list, int sum, int n, int k, int start) {
        if (list.size() == k) {
            if (sum == n) {
                res.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            list.add(i);
            backtrack(res, list, sum+i, n, k, i+1);
            list.remove(list.size() - 1);
        }
    }
}
