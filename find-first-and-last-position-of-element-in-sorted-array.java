class Solution {
    public int[] searchRange(int[] nums, int target) {
      int output[] = {-1, -1};
      int l = 0, r = nums.length - 1, mid;
      while (l <= r) {
          mid = (l + r) / 2;
          if (nums[mid] == target) {
              output[0] = mid;
              r = mid - 1;
          } else if (nums[mid] > target) r = mid - 1;
          else l = mid + 1;

      }

      l = 0;
      r = nums.length - 1;
      while (l <= r) {
          mid = (l + r) / 2;
          if (nums[mid] == target) {
              output[1] = mid;
              l = mid + 1;
          } else if (nums[mid] > target) r = mid - 1;
          else l = mid + 1;
      }
      return output;
  }
}