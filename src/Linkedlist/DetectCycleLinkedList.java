package Linkedlist;

/**
 * Created by shthakar on 3/26/17.
 */
public class DetectCycleLinkedList {


  public boolean detectCycle(Node head) {
    if (head == null || head.getNext() == null)
      return false;

    Node hare = head;
    Node tortoise = head;

    while (hare.getNext() != null && hare.getNext().getNext() != null) {
      hare = hare.getNext().getNext();
      tortoise = tortoise.getNext();

      if (hare == tortoise)
        return true;

    }

    return false;
  }
}
