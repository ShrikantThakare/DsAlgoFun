package Trees;

/**
 * Created by shthakar on 3/22/17.
 */
public class MirrorBinaryTree {

  public static void mirror (Node root){

    // https://leetcode.com/problems/invert-binary-tree/#/solutions
    https://leetcode.com/problems/invert-binary-tree/#/solutions

    if (root == null)
      return;

    mirror(root.getLeftNode());
    mirror(root.getRightNode());

    Node temp = root.getLeftNode();
    root.setLeftNode(root.getRightNode());
    root.setRightNode(temp);
  }
}

/*

public class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            final TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}


*
 */
