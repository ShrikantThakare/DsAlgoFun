package Linkedlist;

/**
 * Created by shthakar on 3/26/17.
 */
public class ReverseLinkedList {

  public void reverse(Node head) {

    if (head == null)
      return;

    Node current = head;
    Node temp;
    Node newHead = null;

    while (current != null) {
      temp = current;
      current = current.getNext();
      temp.setNext(newHead);
      newHead = temp;

    }
  }

}
