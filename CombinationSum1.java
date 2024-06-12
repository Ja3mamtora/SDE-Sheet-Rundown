import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum1 {
    HashSet<List<Integer>>ans = new HashSet<List<Integer>>();
    void solve(int ind, int[] arr, List<Integer>ds, int n, int sum , int t) {
        if(ind == n) {
            // Collections.sort(ds);
            if(sum == t)
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(sum < t) {
            ds.add(arr[ind]);
            sum += arr[ind];
            solve(ind,arr,ds,n,sum,t);
            sum -= arr[ind];
            ds.remove(ds.size()-1);
        }
        solve(ind+1,arr,ds,n,sum,t);
    }
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        Arrays.sort(arr);
        List<Integer>ds = new ArrayList<>();
        int n = arr.length;
        
        solve(0,arr,ds,n,0,t);
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
    }
}
