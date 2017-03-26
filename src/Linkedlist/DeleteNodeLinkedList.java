package Linkedlist;

/**
 * Created by shthakar on 3/26/17.
 */
class DeleteNodeLinkedList {


  public boolean deleteNode(Node head, int valToDelete) {

    if (head == null)
      return false;

    if (head.getData() == valToDelete)
      head = head.getNext();

    Node current = head;

    while (current.getNext() != null) {

      if (current.getNext().getData() == valToDelete) {
        current.setNext(current.getNext().getNext());
        return true;
      } else
        current = current.getNext();

    }

    return false;

  }
}
