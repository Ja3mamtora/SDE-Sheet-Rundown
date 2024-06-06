import java.util.TreeMap;

public class NoOfSubbarayWithXorK {
    public int solve(int[] A, int B) {
        TreeMap<Integer,Integer>mp = new TreeMap<>();
        int xr = 0;
        int cnt = 0;
        
        mp.put(xr,1);
        
        for(int i = 0 ; i < A.length ; i++) {
            xr ^= A[i];
            
            int x = xr^B;
            if(mp.containsKey(x)) {
                cnt += mp.get(x);
            }
            
           if(mp.containsKey(xr)) {
               mp.put(xr,mp.get(xr)+1);
           }
           else {
               mp.put(xr,1);
           }
        }
        return cnt;
    }
}
