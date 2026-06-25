class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        // Sort it lexicographically, same as names are stored in attendance register
        Arrays.sort(strs);

        String firstString = strs[0];
        String lastString = strs[strs.length - 1]; 
        int index = 0;

        while (index < firstString.length() && index < lastString.length()){
            if(firstString.charAt(index) != lastString.charAt(index)) {
                break;
            }
            index++;
        }

        return firstString.substring(0, index);
    }
}