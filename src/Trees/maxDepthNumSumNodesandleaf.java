package Trees;

/**
 * Created by shthakar on 3/26/17.
 */
public class maxDepthNumSumNodesandleaf {


  public int maxDepth(Node root) {

    if (root == null)
      return 0;

    return 1 + Math.max(maxDepth(root.getLeftNode()), maxDepth(root.getRightNode()));

  }

  // -----------------------------------------

  int numNodes;
  int numLeafNodes;

  public int countNodes(Node root) {


    if (root == null)
      return 0;

    numNodes = numNodes + 1;

    countNodes(root.getLeftNode());
    countNodes(root.getRightNode());

    return numNodes;

  }

  // -----------------------------------------

  public int countLeafNodes(Node root) {

    if (root == null)
      return 0;

    if (root.getLeftNode() == null && root.getRightNode() == null)
      numLeafNodes = numLeafNodes + 1;

    countNodes(root.getLeftNode());
    countNodes(root.getRightNode());

    return numLeafNodes;

  }

  // -----------------------------------------


  int sumOfNodes;
  int sumOfLeafNodes;

  public int sumNodes(Node root) {

    if (root == null)
      return 0;

    sumOfNodes = sumOfNodes + (int) root.getData();
    sumNodes(root.getLeftNode());
    sumNodes(root.getRightNode());

    return sumOfNodes;
  }

  // -----------------------------------------


  public int sumLeafNodes(Node root) {

    if (root == null)
      return 0;

    if (root.getLeftNode() == null && root.getRightNode() == null)
      sumOfLeafNodes = sumOfLeafNodes + (int) root.getData();

    sumLeafNodes(root.getLeftNode());
    sumLeafNodes(root.getRightNode());

    return sumOfLeafNodes;
  }

}

