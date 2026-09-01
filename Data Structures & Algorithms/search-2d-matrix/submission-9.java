class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows*columns-1;
        while (left<=right) {
            int midpoint = left + (right-left)/2;
            int element = matrix[midpoint/columns][midpoint%columns];
            if (element == target) {
                return true;
            } else if (element < target){
                left = midpoint + 1;
            } else if (element > target){
                right = midpoint - 1;
            }
        }
        return false;
    }
}