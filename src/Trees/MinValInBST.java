package Trees;

/**
 * Created by shthakar on 3/22/17.
 */
public class MinValInBST<T extends Integer> {

  public T minValue(Node head) {
    if (head == null)
      return null;

    if (head.getLeftNode() == null)
      return (T) head.getData();

    return minValue(head.getLeftNode());
  }
}
