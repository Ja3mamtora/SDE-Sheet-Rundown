import java.util.ArrayList;
import java.util.List;

public class MedianOf2SortedArr {
    double solve(int[] arr1, int[] arr2, int n, int m, int k) {
        int sec = (m + n) % 2 == 0 ? -1 : 0;
        int ind = 0;
        double ans = 0.0d;
        List<Long> arr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m && ind != k) {
            if (arr1[i] <= arr2[j]) {
                arr.add(Long.valueOf(arr1[i]));
                i++;
            } else {
                arr.add(Long.valueOf(arr2[j]));
                j++;
            }
            ind++;
        }
        if (ind == k) {
            if (sec == -1) {
                ans += arr.get(ind - 2);
                ans += arr.get(ind - 1);
                return ans / 2.0d;
            } else
                return arr.get(ind - 1);
        }
        while (i < n && ind != k) {
            arr.add(Long.valueOf(arr1[i]));
            i++;
            ind++;
        }
        if (ind == k) {
            if (sec == -1) {
                ans += arr.get(ind - 2);
                ans += arr.get(ind - 1);
                return ans / 2.0d;
            } else
                return arr.get(ind - 1);
        }
        while (j < m && ind != k) {
            arr.add(Long.valueOf(arr2[j]));
            j++;
            ind++;
        }
        if (sec == -1) {
            ans += arr.get(ind - 2);
            ans += arr.get(ind - 1);
            return ans / 2.0d;
        } else
            return arr.get(ind - 1);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int mid = (m + n) / 2;

        return solve(nums1, nums2, n, m, mid + 1);

    }
}
