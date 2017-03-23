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

      Node node = queue.remove();
      System.out.println(node.getData());

      if (null != root.getLeftNode()) // $
        queue.add(root.getLeftNode());

      if (null != root.getRightNode()) // $
        queue.add(root.getRightNode());

    }
  }
}
