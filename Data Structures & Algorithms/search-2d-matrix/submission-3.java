class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows*columns-1;
        int midpoint = left + (right-left)/2;
        int element = matrix[midpoint/columns][midpoint%rows];

        while (left<=right) {
            if (element == target) {
                return true;
            } else if (element < target){
                left++;
            } else if (element > target){
                right--;
            }
        }
        return false;
    }
}
