class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag = false;

        if(nums.length == 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                flag = true;
                break;
            }
            map.put(nums[i], 1);
        }

        return flag;
    }
}