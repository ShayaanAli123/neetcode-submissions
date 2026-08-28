class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int maxHeight = 0;
        while (left<right){
            if (height[left] < height[right]){
                maxHeight = Math.max(maxHeight, height[left]* (right-left));
                left++;
            } else {
                maxHeight = Math.max(maxHeight, height[right]*(left-right));
                right--;
            }
        }
        return maxHeight;
    }
}
