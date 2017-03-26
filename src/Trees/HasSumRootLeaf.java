package Trees;

/**
 * Created by shthakar on 3/25/17.
 */
public class HasSumRootLeaf {


  public boolean hasSum(Node node, int sum) {

    boolean sumExists;


    // Check condition
    if (node.getLeftNode() == null && node.getRightNode() == null) {
      return sum == (int) node.getData();//Core logic
    }

    sum = sum - (int) node.getData();//Core logic

    if (node.getLeftNode() != null) {

      sumExists = hasSum(node.getLeftNode(), sum);

      if (sumExists)
        return true;
    }

    if (node.getRightNode() != null) {

      sumExists = hasSum(node.getRightNode(), sum);

      if (sumExists)
        return true;
    }


    return false;
  }
}
