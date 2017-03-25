package Trees;

/**
 * Created by shthakar on 3/23/17.
 */
public class EqualsTree {

  public static boolean isEqual(Node a, Node b) {

    if (a == b)
      return true;

    if (a == null || b == null)
      return false;


    if (a.getData() != b.getData())
      return false;

    if(!isEqual(a.getLeftNode(),b.getLeftNode()))
      return false;

    if(!isEqual(a.getRightNode(),b.getRightNode()))
      return false;

    return true;

  }
}
