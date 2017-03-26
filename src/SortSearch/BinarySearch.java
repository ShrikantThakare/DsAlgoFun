package SortSearch;

/**
 * Created by shthakar on 3/25/17.
 */
public class BinarySearch {


  public int binarysearch(int[] input, int searchValue, int low, int high) {

    if (low > high)
      return -1;

    int midIdx = low + high / 2;

    if (input[midIdx] == searchValue)
      return searchValue;

    if (input[midIdx] > searchValue)
      return binarysearch(input, searchValue, low, midIdx - 1);
    else
      return binarysearch(input, searchValue, midIdx + 1, high);

  }

}
