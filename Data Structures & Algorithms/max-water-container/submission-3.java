class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length - 1;
        int left = 0;
        int maxHeight = 0;
        while (left<right){
            int heightFormula = (right-left) * Math.min(heights[left],heights[right]);
            if (heightFormula>maxHeight){
                maxHeight = heightFormula;
            } else {
                left++;
                right--;
            }
        }
        return maxHeight;
    }
}
