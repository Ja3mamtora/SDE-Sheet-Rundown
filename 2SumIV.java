public class 2SumIV {
    HashMap<Integer,Integer>mp = new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(mp.containsKey(k-root.val)) return true;
        mp.put(root.val,1);
        
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}
