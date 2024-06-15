public class AllocateBooks {
    public int books(int[] A, int B) {
        if (B > A.length) {
            return -1;

        }

        int max = 0, min = 0, ans = 0;
        for (int i = 0; i < A.length; i++) {
            max += A[i];
            min = Math.max(min, A[i]);
        }

        while (min <= max) {
            int mid = (min + max) / 2;
            if (isFeasiable(A, B, mid)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    boolean isFeasiable(int[] A, int k, int ans) {
        int student = 1, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum + A[i] > ans) {
                student++;
                sum = A[i];
            } else {
                sum += A[i];
            }
        }
        return student <= k;
    }
}
