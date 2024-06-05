public class SearchInaMatrix {
    public boolean searchMatrix(int[][] arr, int target) {
        int i = 0, j = arr[0].length-1;
        
        while(i < arr.length && j >= 0) {
            if(arr[i][j] == target) {
                return true;
            }

            else if(arr[i][j] > target) {
                j--;
            }

            else{
                i++;
            }
        }

        return false;
    }
}
