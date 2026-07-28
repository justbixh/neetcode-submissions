class Solution {
    public int[] twoSum(int[] nums, int target) {
        // loop each
        // x = target - i
        // if arr has x; return arr[x]

        // 3
        int x;
        int[] out = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            out[0] = i;
            x = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == x) {
                    out[1] = j;
                    return out;
                }
            }
        }
        return out;
    }
}
