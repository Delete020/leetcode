/**
 * @author Delete020
 * @since 07/20/22 23:07 PM
 */
public class FlattenBinaryTreetoLinkedList {
    TreeNode last = null;

    public void flatten(TreeNode node) {
        if (node == null) return;
        flatten(node.right);
        flatten(node.left);
        node.right = last;
        node.left = null;
        last = node;
    }
}