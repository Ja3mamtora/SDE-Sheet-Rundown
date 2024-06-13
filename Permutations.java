import java.util.*;
public class Permutations {
    List<List<Integer>>ans = new ArrayList<>();
    void solve(int nums[], int index) {
        if (index == nums.length) {
            List<Integer>ds = Arrays.stream(nums).boxed().toList();
            ans.add(ds);
            return;
        }
        for (int i = index; i < nums.length; i++) {
             int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            solve(nums, index + 1);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        solve(nums,0);
        return ans;
    }
}
