class Solution {
    public int longestSubarray(int[] nums) {
        int zeros = 0 ;
        int max = 0;
        int start = 0 ;


        for(int end = 0 ; end < nums.length ; end++){
            if(nums[end] == 0){
                zeros++;
            }

            while(zeros > 1){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
            max = Math.max(max, end - start );
        }

        return max;

    }
}