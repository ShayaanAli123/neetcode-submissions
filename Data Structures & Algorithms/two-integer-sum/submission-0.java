class Solution {
    public int[] twoSum(int[] nums, int target) {
        // so I need to find which of the two indices within the array
        // give me the target and it cannot be the same spot 
        // and the output is a new array containing those two integers
        int[] result = new int [2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; i< nums.length; i++){
                if ((nums [i] + nums [j]) == target && (i!=j)){
                    System.out.println("Output: [" + i + "," + j + "]");
                    result [0] = j;
                    result [1] = i;
                }
            }
        }
    return result;
    }   
    
}
