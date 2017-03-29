package ArrayandString;

/**
 * Created by shthakar on 3/28/17.
 */
public class MaxSumSubarrayKadane {


  public static void printSubArray(int[] array) {

    int cumulativeSum = 0;
    int maxSum = 0;

    int maxStartIdx = 0;
    int maxEndIdx = 0;

    int maxIdxTillNow = 0;

    for (int currentIdx = 0; currentIdx < array.length; currentIdx++) {

      cumulativeSum += array[currentIdx];

      if (cumulativeSum > maxSum) {
        maxSum = cumulativeSum;
        maxStartIdx = maxIdxTillNow;
        maxEndIdx = currentIdx;

      } else if (cumulativeSum < 0) {
        cumulativeSum = 0;
        maxIdxTillNow = currentIdx + 1;
      }


    }

  }
}
