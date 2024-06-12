import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SubsetSum2 {
    HashSet<List<Integer>>ans = new HashSet<List<Integer>>();
    void solve(int ind, int[] arr, List<Integer>ds, int n) {
        if(ind == n) {
            Collections.sort(ds);
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        solve(ind+1,arr,ds,n);
        ds.remove(ds.size()-1);
        solve(ind+1,arr,ds,n);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<Integer>ds = new ArrayList<>();
        
        int n = arr.length;
        
        solve(0,arr,ds,n);
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
    }
}
