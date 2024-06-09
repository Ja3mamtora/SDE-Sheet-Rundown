public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int cnt = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0) {
                cnt = 0;
            }
            else
            cnt++;
            maxi = Math.max(maxi,cnt);
        }
        return maxi;
    }
}
