class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = -10000000, sum = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            maxi = Math.max(maxi,sum);
            if(sum < 0) sum = 0;
        }
        return maxi;
    }
}