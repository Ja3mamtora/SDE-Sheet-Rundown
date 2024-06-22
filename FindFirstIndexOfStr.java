public class FindFirstIndexOfStr {
    public int strStr(String s, String needle) {
        for(int i = 0 ; i < s.length()-needle.length() ; i++) {
            int j = 0;
            while(j < needle.length()) {
                if(s.charAt(i+j) == needle.charAt(j)){
                    j++;
                }
            }
            if(j == needle.length())return i;
        }
        return -1;
    }
}
