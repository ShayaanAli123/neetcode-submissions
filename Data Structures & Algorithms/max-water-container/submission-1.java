class Solution {
    public int maxArea(int[] heights) {
        int j = heights.length - 1;
        int maxHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = (j - i) * Math.min(heights[i], heights[j]);
            if (area > maxHeight) {
                maxHeight = area;
            }
        }
        return maxHeight;
    }
}