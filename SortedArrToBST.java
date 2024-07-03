import javax.swing.tree.TreeNode;

public class SortedArrToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;

        TreeNode head = solve(nums,0,nums.length-1);
        return head;
    }

    TreeNode solve(int[] nums, int low, int high) {
        if(low  > high) return null;

        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = solve(nums,low,mid-1);
        root.right = solve(nums,mid+1,high);
        return root;
    }
}
