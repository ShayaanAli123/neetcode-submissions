class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        String newString = "";

        for (int i =0; i<s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                newString+= Character.toLowerCase(s.charAt(i));
            }

        }
        int left = 0;
        int right = newString.length()-1;

        while (left <right) {
            if (newString.charAt(left) == newString.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    } 
}

