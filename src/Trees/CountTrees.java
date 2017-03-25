package Trees;

/**
 * Created by shthakar on 3/24/17.
 */
public class CountTrees {

  public static int countTrees(int numNodes) {

    int sum = 0;

    for (int i = 0; i < numNodes; i++) {

      int leftTress = countTrees(i - 1);
      int rigthTrees = countTrees(numNodes - i);

      sum = sum + leftTress * rigthTrees;

    }
    return sum;
  }
}
