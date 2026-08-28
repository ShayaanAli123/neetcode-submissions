class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 1;

        for (int i =0; i<numbers.length; i++) {
            if ((numbers[index1] + numbers[index2]) == target){
                return new int[] {numbers[index1],numbers[index2]};
            } else {
                index1++;
                index2++;
            }
            
        }
        return new int[] {index1,index2};
    }
}
