class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] == val && nums[end] != val) {
                swap(nums, start, end);
                start++;
                end--;
            } else if (nums[start] == val && nums[end] == val) {
                end--;
            } else if (nums[start] != val && nums[end] != val) {
                start++;
            } else {
                end--;
            }
        }

        if(nums[start] == val) {
            return start;
        }else {
            return start + 1;
        }
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}