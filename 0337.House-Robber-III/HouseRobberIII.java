import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 08/22/22 20:44 PM
 */
public class HouseRobberIII {
    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) return 0;
        if (map.containsKey(root)) return map.get(root);
        int money = root.val;
        if (root.left != null) money += rob(root.left.left) + rob(root.left.right);
        if (root.right != null) money += rob(root.right.left) + rob(root.right.right);
        int ans = Math.max(money, rob(root.left) + rob(root.right));
        map.put(root, ans);
        return ans;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}