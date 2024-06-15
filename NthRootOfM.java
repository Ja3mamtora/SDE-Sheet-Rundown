public class NthRootOfM {
    static int solve(int mid, int n, int m) {
        long ans = 1;

        for(int i = 1 ; i <= n ; i++) {
            ans *= mid;
            if(ans > m)return 2;
        }

        if(ans == m)return 1;
        return 0;
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int i = 1;
        int j = m;

        while(i <= j) {
            int mid = (i+j)/2;

            if(solve(mid,n,m) == 1)return mid;
            else if(solve(mid,n,m) == 2) j = mid-1;
            else i = mid+1;
        }
        return -1;
    }
}
