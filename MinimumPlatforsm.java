import java.util.Arrays;

public class MinimumPlatforsm {
    // use 2 pointer greedy approach
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int cnt = 0;
        int maxi = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                i++;
                cnt++;
            } else {
                cnt--;
                j++;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;

    }

}
