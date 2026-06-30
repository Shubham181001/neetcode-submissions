class Solution {
    public String mergeAlternately(String word1, String word2) {
        int idx = 0;
        StringBuilder sb = new StringBuilder("");

        while(idx < word1.length() && idx < word2.length()) {
            sb.append(word1.charAt(idx) + "");
            sb.append(word2.charAt(idx) + "");
            idx++;
        }

        if(idx < word1.length()) {
            String sub = word1.substring(idx);
            sb.append(sub);
        }

        if(idx < word2.length()) {
            String sub = word2.substring(idx);
            sb.append(sub);
        }

        String ans = sb.toString();
        return ans;
    }
}