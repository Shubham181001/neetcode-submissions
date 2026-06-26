class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs) {
            char[] arr = new char[26];
            for(char c : s.toCharArray()){
                arr[c - 'a']++;
            }
            String arrString = new String(arr);
            res.putIfAbsent(arrString, new ArrayList<>());
            res.get(arrString).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
