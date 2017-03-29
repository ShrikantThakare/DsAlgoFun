package SortSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shthakar on 3/26/17.
 */
public class MergeKSortedList {

  /*
  * Create min heap with size equal to lists size
  * Copy smallest element from all list in heap
  * Crate a new list to hold sorted list with size = sum of all lists
  * Till new list length is less than sum of all list length
  *
  * get element out of heap
  * insert it in list
  * get list index from element and insert the next element from the list into minheap
  * */


  public void mergeKLists(int numOfElements, List<List<Integer>> listOfLists) throws Heap.HeapFullException, Heap.HeapEmptyException {

    MinHeap<Element> minHeap = new MinHeap<>(Element.class, listOfLists.size());


    for (int i = 0; i < listOfLists.size(); i++) {
      if (!listOfLists.get(i).isEmpty())
        minHeap.insert(new Element(i, listOfLists.get(i).remove(0))); // $$ remove

    }

    List<Integer> sortedList = new ArrayList<>();


    while (sortedList.size() < numOfElements) {
      Element val = minHeap.getHighestPriority();
      sortedList.add(val.getValue());

      if (!listOfLists.get(val.getListIndex()).isEmpty())
        minHeap.insert(new Element(val.getListIndex(), listOfLists.get(val.getListIndex()).remove(0)));

    }

  }

}
