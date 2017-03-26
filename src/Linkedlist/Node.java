package Linkedlist;

/**
 * Created by shthakar on 3/26/17.
 */
public class Node {

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  private int data;

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  private Node next = new Node();
}
