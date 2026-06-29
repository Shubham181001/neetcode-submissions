class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseString = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            if(!Character.isLetterOrDigit(lowerCaseString.charAt(start))) {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(lowerCaseString.charAt(end))) {
                end--;
                continue;
            }
            if(lowerCaseString.charAt(start) != lowerCaseString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
