package Trees;

/**
 * Created by shthakar on 3/24/17.
 */
public class LCA_BST {

  // LCA in BST does not use recursive solution
  public static Node LCA(Node root, int a, int b) {

    // Swap if a is not less than b

    while (root != null) { //$

      if (a < (int) root.getData() && b < (int) root.getData())
        root = root.getLeftNode();

      else if (a > (int) root.getData() && b > (int) root.getData())
        root = root.getRightNode();

      else // $
        return root;
    }

    return null;
  }


}
