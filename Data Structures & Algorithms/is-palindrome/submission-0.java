class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length()-1-i)){
                return true;
            }
        }
        return false;
    }
}
