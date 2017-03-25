package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shthakar on 3/25/17.
 */
public class PrintPathRootLeaf {

  List<Node> pathList = new ArrayList<>();


  public void printPath(Node root) {

    if (root == null)
      return;

    pathList.add(root);
    printPath(root.getLeftNode());
    printPath(root.getRightNode());

    if (root.getRightNode() == null && root.getLeftNode() == null) {
      System.out.println(pathList);
    }

    pathList.remove(root);

  }


}
