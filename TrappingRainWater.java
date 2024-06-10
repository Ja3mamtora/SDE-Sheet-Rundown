public class TrappingRainWater {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] mxr = new int[n];
        int[] mxl = new int[n];

        mxl[0] = arr[0];
        for (int i = 1; i < n; i++) {
            mxl[i] = Math.max(mxl[i - 1], arr[i]);
        }

        mxr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mxr[i] = Math.max(mxr[i + 1], arr[i]);
        }

        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = Math.min(mxr[i], mxl[i]) - arr[i];
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += w[i];
        }

        return (int) ans;
    }
}
