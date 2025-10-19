class Solution {

    List<List<Integer>> res = new ArrayList<>();
    int N, K ;

    public List<List<Integer>> combine(int n, int k) {
        N = n ;
        K = k ;

        backtrack(new ArrayList<>(), 1);
        return res;
    }

    private void backtrack(List<Integer> list, int start ) {

        if (list.size() == K) {
            res.add(new  ArrayList<>(list));
            return;
        }

        for (int i = start; i <=  N; i++) {
            list.add(i);
            backtrack(list, i + 1);
            list.removeLast();
        }
    }
}