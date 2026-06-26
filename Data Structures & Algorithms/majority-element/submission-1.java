class Solution {
    public int majorityElement(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int n = nums.length;
        int majority = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > max) {
                    max = map.get(nums[i]);
                    majority = nums[i];
                } else {
                    max = max;
                }
            } else {
                map.put(nums[i], 1);
            }
        }

        return majority;
    }
}