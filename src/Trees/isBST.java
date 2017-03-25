package Trees;

/**
 * Created by shthakar on 3/24/17.
 */
public class isBST {


  public static boolean isBST(Node root, int low, int high) {


    if (root == null)
      return true; //$ null node is vaid BT


    if ((int) root.getData() > high || (int) root.getData() <= low)
      return false;


    // For R-ST - node.getRight(),node.getData,max

    // For LST - the current nodes value should be greater than leftNode value
    // For L-ST - node.getLeft(),min,node.getData

    return isBST(root.getLeftNode(), low, (int) root.getData()) && isBST(root.getRightNode(), (int) root.getData(), high);
  }
}

