class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maximum = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==1){
                counter++;
                maximum = Math.max(counter, maximum);

            } else {
                counter = 0;
            }
        }
        return maximum;
    }
}