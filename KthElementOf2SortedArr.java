import java.util.ArrayList;
import java.util.List;

public class KthElementOf2SortedArr {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int ind = 0;
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
        if (ind == k)
            return (arr.get(ind - 1));
        while (i < n && ind != k) {
            arr.add(Long.valueOf(arr1[i]));
            i++;
            ind++;
        }
        if (ind == k)
            return arr.get(ind - 1);
        while (j < m && ind != k) {
            arr.add(Long.valueOf(arr2[j]));
            j++;
            ind++;
        }
        return arr.get(ind - 1);
    }
}
