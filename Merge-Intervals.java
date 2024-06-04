import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge-Intervals {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(o1,o2)->o1[0]-o2[0]);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(ans.size() == 0 || nums[i][0] > ans.get(ans.size()-1).get(1)) {
                ans.add(Arrays.asList(nums[i][0],nums[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), nums[i][1]));
            }
        }

        int numRows = ans.size();
        int numCols = ans.get(0).size();


        int[][] arr = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr[i][j] = ans.get(i).get(j);
            }
        }

        return arr;
    }
}
