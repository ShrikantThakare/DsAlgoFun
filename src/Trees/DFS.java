package Trees;

/**
 * Created by shthakar on 3/22/17.
 */
public class DFS {

 // L-Root-R
  public static void inOrder(Node root) {

    if (root == null)
      return;

    inOrder(root.getLeftNode());
    System.out.println(root.getData());
    inOrder(root.getRightNode());
  }

  // L-R-Root
  public static void postOrder(Node root) {

    if (root == null)
      return;

    inOrder(root.getLeftNode());
    inOrder(root.getRightNode());
    System.out.println(root.getData());
  }

  // Root-L-R
  public static void preOrder(Node root) {

    if (root == null)
      return;

    System.out.println(root.getData());
    inOrder(root.getLeftNode());
    inOrder(root.getRightNode());

  }

}
