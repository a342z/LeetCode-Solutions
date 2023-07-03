class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int ptr1 = 0;
        int ptr2 = nums.length-1;

        while(ptr1<=ptr2){

            if(nums[ptr2]==val){
                count++;
                ptr2--;
                continue;
            }
            if(nums[ptr1]==val){
                count++;
                nums[ptr1]=nums[ptr2];
                nums[ptr2]=val;
                ptr2--;
            }
            ptr1++;

        }
        return nums.length-count;
    }
}