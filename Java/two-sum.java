class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(numbers.containsKey(target-nums[i]) && numbers.get(target-nums[i]) != i)
                return new int[] {i,numbers.get(target-nums[i])};
            numbers.put(nums[i],i);
        } 
        return new int[] {};
    }
}