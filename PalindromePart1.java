import java.util.ArrayList;
import java.util.List;

public class PalindromePart1 {
    int isPalindrome(String s, int i , int j){
        if(i == j)return 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return 0;
            }
            i++;j--;
        }
        return 1;
    }
    void solve(int ind, String s, List<String>ds, List<List<String>>ans){
        if(ind == s.length() && ds.size() > 0) {
            ans.add(new ArrayList<>(ds));
        }

        else{
            for(int i = ind ; i < s.length() ; i++){
                if(isPalindrome(s,ind,i) == 1){
                    ds.add(s.substring(ind,i+1));
                    solve(i+1,s,ds,ans);
                    ds.remove(ds.size()-1);
                }
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String>ds = new ArrayList<>();
        List<List<String>>ans = new ArrayList<>();
        solve(0,s,ds,ans);
        return ans;
    }
}
