import java.util.ArrayList;

public class OnlineStockSpan {
    ArrayList<Integer> arr = new ArrayList<>();

    public void StockSpanner() {

    }

    public int next(int price) {
        arr.add(price);
        int cnt = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) <= price) {
                cnt++;
            } else {
                break;
            }
        }

        return cnt;
    }
}
