import java.util.*;
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer,Integer>mp = new TreeMap<>();
        int[] ans = new int[2];

        for(int i = 0 ; i < nums.length ; i++) {
            if(mp.containsKey(target-nums[i])){
                ans[0] = mp.get(target-nums[i]);
                ans[1] = i;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}
