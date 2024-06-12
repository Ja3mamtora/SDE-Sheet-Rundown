import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
     List<List<Integer>>ans = new ArrayList<>();
    void solve(int ind, int[] arr, List<Integer>ds, int n, int t) {
        if(t == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind ; i < n ; i++) {
            if(i>ind && arr[i] == arr[i-1])continue;
            if(arr[i] > t) break;
            ds.add(arr[i]);
            solve(i+1,arr,ds,n,t-arr[i]);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);
        List<Integer>ds = new ArrayList<>();
        int n = arr.length;
        
        solve(0,arr,ds,n,t);
        return ans;
    }
}
