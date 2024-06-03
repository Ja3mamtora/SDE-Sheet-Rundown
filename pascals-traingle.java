import java.util.*;

class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans = new ArrayList<>();

        if(n == 0) return ans;

        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        for(int i = 1 ; i < n ; i++) {
            List<Integer> prv = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for(int j = 1 ; j < prv.size() ; j++) {
                curr.add(prv.get(j)+prv.get(j-1));
            }

            curr.add(1);
            ans.add(curr);
        }
        return ans;
    }
}