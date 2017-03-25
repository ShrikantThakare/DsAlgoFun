package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shthakar on 3/22/17.
 */
public class BFS {

  public static void bfs(Node root) {

    if (root == null)
      return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (queue.size() != 0) {

      // For level wise node print : Just decrement value nodesInCurrentLevel

      Node node = queue.remove();
      System.out.println(node.getData());

      if (null != root.getLeftNode()) // $
        queue.add(root.getLeftNode());
      // For level wise node print : Increment the value of nodesToPrint

      if (null != root.getRightNode()) // $
        queue.add(root.getRightNode());

      // For level wise node print : Chekc if nodesInCurrentLevel = 0 then
      // add new line and nodesToPrint = nodesInCurrentLevel

    }
  }
}
