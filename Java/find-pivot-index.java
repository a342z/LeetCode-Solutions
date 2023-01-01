class Solution {
    public int pivotIndex(int[] nums) {
        int leftPrefixSum[] = new int[nums.length+2];
        int rightPrefixSum[] = new int[nums.length+2];

        for(int i=0; i<nums.length;i++){
    
            leftPrefixSum[i+1] = nums[i] + leftPrefixSum[i];
            rightPrefixSum[rightPrefixSum.length - i - 2] = nums[nums.length-i-1] + rightPrefixSum[rightPrefixSum.length - i - 1];
        }

        for(int i=1;i<leftPrefixSum.length -1;i++){
            if(leftPrefixSum[i-1] == rightPrefixSum[i+1])
                return i - 1 ;
        }

        return -1;
    }
}