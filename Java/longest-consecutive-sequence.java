class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        int maxCount=0;
        for (int num:nums) {
            hash.add(num);
        }
        for (Integer num : hash) {
            if(!hash.contains(num-1)){
                int count=0;
                while(hash.contains(num+count)){
                    count++;
                }
                maxCount=Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}