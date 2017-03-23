package Trees;

/**
 * Created by shthakar on 3/22/17.
 */
public class Node<T> {


  private T data;
  private Node<T> leftNode;
  private Node<T> rightNode;

  public void setData(T input) {
    this.data = input;
  }

  public T getData() {
    return data;
  }

  public void setLeftNode(Node leftNode) {
    this.leftNode = leftNode;

  }

  public void setRightNode(Node rightNode) {
    this.rightNode = rightNode;
  }

  public Node getLeftNode() {
    return leftNode;

  }

  public Node getRightNode() {
    return rightNode;
  }
}
