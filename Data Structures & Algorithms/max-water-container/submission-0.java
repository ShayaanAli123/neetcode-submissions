class Solution {
    public int maxArea(int[] heights) {
        int j = heights.length-1;
        int maxHeight = 0;
        for (int i=0; i<heights.length; i++) {
            if ((j-i)*min(heights[i], heights[j] > maxHeight)){
                maxHeight = (j-i)*min(heights[i], heights[j] > maxHeight);
            }
        }
        return maxHeight;
    }
}
