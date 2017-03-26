package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shthakar on 3/25/17.
 */
public class SerializeDeserializeTree {


  public String serialize(Node root) {

    if (root == null)
      return "";

    StringBuilder stringBuilder = new StringBuilder();
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (queue.size() != 0) {

      Node node = queue.poll();

      if (node != null) { //$
        stringBuilder.append(node.getData() + ",");
        queue.offer(node.getLeftNode());
        queue.offer(node.getRightNode());
      } else {
        stringBuilder.append("#,");
      }

    }

    return stringBuilder.toString();

  }


  public Node deSerialize(String string) {

    if (string == null || string.length() == 0)
      return null;

    String[] strArray = string.split(",");
    Queue<Node> queue = new LinkedList<>();
    int i = 0;

    Node root = new Node();
    root.setData(strArray[i]);
    queue.add(root);
    i++;
    while (queue.size() != 0) {

      Node node = queue.poll();

      if (node == null) //$
        continue;

      if (!strArray[i].equals("#")) {

        Node left = new Node();
        left.setData(strArray[i]);
        queue.offer(left);

      } else {
        Node left = null;
        queue.offer(left);

      }

      i++;

      if (!strArray[i].equals("#")) {
        Node left = new Node();
        left.setData(strArray[i]);
        queue.offer(left);

      } else {
        Node left = null;
        queue.offer(left);
      }
      i++;

    }
    return root;
  }
}
