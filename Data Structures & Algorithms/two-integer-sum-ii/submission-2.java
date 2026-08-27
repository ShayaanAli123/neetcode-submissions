class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        for (int i = 0; i<nums.length; i++) {
            if (nums[first] + nums[last] > target){
                last--;
            } else if (nums[first] + nums[last] == target){
                return new int[] {first+1, last+1};
            } else {
                first++;
            }
        }
        return new int[] {first+1, last+1};
    }
}
