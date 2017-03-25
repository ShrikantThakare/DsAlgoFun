package Trees;

/**
 * Created by shthakar on 3/24/17.
 */
public class LCA_Tree {


  public static Node LCA(Node root, int a, int b) {


    if (root == null)
      return null;

    if ((int) root.getData() == a || (int) root.getData() == b)
      return root;


    Node lca_l = LCA(root.getLeftNode(), a, b);
    Node lca_r = LCA(root.getRightNode(), a, b);

    if (lca_l != null && lca_r != null)
      return root;

    return lca_l == null ? lca_r : lca_l;

  }
}
