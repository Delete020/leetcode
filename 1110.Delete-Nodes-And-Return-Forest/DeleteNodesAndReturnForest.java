import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Delete020
 * @since 05/30/23 20:48 PM
 */
public class DeleteNodesAndReturnForest {
    Set<Integer> delete;
    List<TreeNode> ans;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        delete = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        ans = new ArrayList<>();
        traversal(root);
        if (!delete.contains(root.val)) ans.add(root);
        return ans;
    }

    private TreeNode traversal(TreeNode node) {
        if (node == null) return null;
        node.left = traversal(node.left);
        node.right = traversal(node.right);
        if (delete.contains(node.val)) {
            if (node.left != null) ans.add(node.left);
            if (node.right != null) ans.add(node.right);
            return null;
        }
        return node;
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