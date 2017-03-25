package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shthakar on 3/25/17.
 */
public class LevelWisePrintNodes {


  public static void printNodes(Node root) {

    if (root == null)
      return;


    int nodesToPop = 1; // $
    int nodesInCurrentLevel = 0;

    Queue<Node> queue = new LinkedList<>();

    queue.add(root);


    while (queue.size() != 0) {

      Node node = queue.remove();

      System.out.println(node.getData());
      nodesToPop--;

      if (node.getLeftNode() != null) {
        queue.add(node.getLeftNode());
        nodesInCurrentLevel++;
      }

      if (node.getRightNode() != null) {
        queue.add(node.getRightNode());
        nodesInCurrentLevel++;
      }

      if (nodesToPop == 0) {
        System.out.println("/n");
        nodesToPop = nodesInCurrentLevel;
        nodesInCurrentLevel = 0;
      }


    }


  }

}
