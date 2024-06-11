import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    class Item {
        int value, weight;

        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }
    }

    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        double ratio[][] = new double[n][2];

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) arr[i].value / arr[i].weight;
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double ans = 0.0d;

        for (int i = n - 1; i >= 0; i--) {
            int ind = (int) ratio[i][0];

            if (w >= arr[ind].weight) {
                ans += arr[ind].value;
                w -= arr[ind].weight;
            } else {
                ans += w * ratio[i][1];
                w = 0;
                break;
            }
        }

        return ans;

    }
}
