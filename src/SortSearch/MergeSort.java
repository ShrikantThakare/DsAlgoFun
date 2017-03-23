package SortSearch;

import java.util.Arrays;

/**
 * Created by shthakar on 3/21/17.
 */
public class MergeSort {


  public static void main(String[] args) {
    int[] arrayToSort = {3, 9, 5, 6, 12, 5, 90};
    mergeSort(arrayToSort);

  }

  public static void mergeSort(int[] arrayToSort) {

    // $
    if (arrayToSort.length == 1)
      return;

    int splitIdx = arrayToSort.length / 2 + arrayToSort.length % 2;

    int[] firstHalf = new int[splitIdx];
    int[] secondHalf = new int[arrayToSort.length - splitIdx];

    split(arrayToSort, firstHalf, secondHalf);

    mergeSort(firstHalf);
    mergeSort(secondHalf);

    merge(arrayToSort, firstHalf, secondHalf);

    System.out.println("Sorted array is " + Arrays.toString(arrayToSort));

  }

  public static void split(int[] arrayToSort, int[] firstHalf, int[] secondHalf) {

    for (int i = 0; i < arrayToSort.length; i++) {

      if (i < firstHalf.length) {
        firstHalf[i] = arrayToSort[i];
      } else {
        secondHalf[i - firstHalf.length] = arrayToSort[i];
      }

    }

  }

  public static void merge(int[] arrayToSort, int[] firstHalf, int[] secondHalf) {

    int fIdx = 0;
    int sIdx = 0;
    int mIdx = 0;

    while (fIdx < firstHalf.length && sIdx < secondHalf.length) {
      if (firstHalf[fIdx] < secondHalf[sIdx]) {
        arrayToSort[mIdx] = firstHalf[fIdx];
        fIdx++;
      } else {
        arrayToSort[mIdx] = secondHalf[sIdx];
        sIdx++;
      }
      mIdx++;
    }

    if (fIdx < firstHalf.length) {
      // $
      while (mIdx < arrayToSort.length) {
        arrayToSort[mIdx++] = firstHalf[fIdx++];
      }
    }

    if (sIdx < secondHalf.length) {

      while (mIdx < arrayToSort.length) {
        arrayToSort[mIdx++] = secondHalf[sIdx++];
      }
    }


  }

}
