class Solution {
    public int[] twoSum(int[] nums, int target) {
        // loop each
        // x = target - i 
        // if arr has x; return Arrays.indexOf[x] in arr

        // 3
        int x;
        int ipos=-1;
        int xpos=-1;
        int [] out = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            ipos = i;
            out[0]=ipos;
            System.out.println("ipos: " + ipos);
            x = target - nums[i];
            System.out.println("diff: " + x);

            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == x) {
                    xpos = j;
                    System.out.println("xpos: " + xpos);
                    out[1]=xpos;
                    return out;
                }
                else {
                    System.out.println("not finding it");
                }
            }


        }
        return out;
    }
}
