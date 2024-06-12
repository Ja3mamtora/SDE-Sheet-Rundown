import java.util.*;
public class SubsetSum1 {
    void solve(int ind, ArrayList<Integer> arr,int sum, int n, ArrayList<Integer> ans) {
        if(ind == n) {
            ans.add(sum);
            return;
        }
        
        sum += arr.get(ind);
        solve(ind+1,arr,sum,n,ans);
        sum -= arr.get(ind);
        solve(ind+1,arr,sum,n,ans);
        
        return;
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        int sum = 0;
        
        solve(0,arr,sum,n,ans);
        return ans;
    }
}
