public class MajorityElement1 {
    public int majorityElement(int[] nums) {
        int mjr = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            if(cnt == 0) {
                cnt++;
                mjr = nums[i];
            }

            else if(nums[i] == mjr){
                cnt++;
            }

            else {
                cnt--;
            }
        }
        return mjr;
    }
}
