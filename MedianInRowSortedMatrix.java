public class MedianInRowSortedMatrix {
    int upperbound(int matrix[], int x, int n) {
        int ans = n;
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (matrix[mid] > x) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    int blackbox(int matrix[][], int n, int m, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += upperbound(matrix[i], x, m);
        }
        return cnt;
    }

    int median(int matrix[][], int r, int c) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }
        int req = (r * c) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            int small = blackbox(matrix, n, m, mid);
            if (small <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}