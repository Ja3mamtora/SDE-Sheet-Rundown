import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0 , cnt2 = 0 , el1 = Integer.MIN_VALUE , el2 = Integer.MIN_VALUE ;

        for(int i = 0 ; i < nums.length ; i++) {
            if(cnt1 == 0 && el2 != nums[i]) {
                cnt1++;
                el1 = nums[i];
            }

            else if(cnt2 == 0 && el1 != nums[i]) {
                cnt2++;
                el2 = nums[i];
            }

            else if(el1 == nums[i]) {
                cnt1++;
            }

            else if(el2 == nums[i]) {
                cnt2++;
            }

            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        List<Integer>arr = new ArrayList<Integer>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
        }

        if(cnt1 > (nums.length/3))arr.add(el1);
        if(cnt2 > (nums.length/3))arr.add(el2);
        

        return arr;
    }
}
