import java.util.HashMap;

public class LongestSubstrWithoutRepeatition {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mp = new HashMap<>();
        int maxi = 0 , n = s.length();
        int i = 0 , j = 0;

        while(j < n) {
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            if(mp.size() >= j-i+1) {
                maxi = Math.max(maxi,j-i+1);
                j++;
            }
            else if(mp.size() < j-i+1) {
                while(mp.size() < j-i+1) {
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                    if(mp.get(s.charAt(i)) == 0) {
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
                if(mp.size() == j-i+1)maxi = Math.max(j-i+1,maxi);
                j++;
            }
        }

        return maxi;
    }
}
