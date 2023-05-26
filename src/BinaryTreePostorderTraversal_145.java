import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {
    private List<Integer> res = new LinkedList<>();

    private void traverse(TreeNode node) {
        if (node == null) return;
        if (node.left != null) traverse(node.left);
        if (node.right != null) traverse(node.right);
        res.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }
}
