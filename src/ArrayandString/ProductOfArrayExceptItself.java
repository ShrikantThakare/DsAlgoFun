package ArrayandString;

/**
 * Created by shthakar on 3/28/17.
 */
public class ProductOfArrayExceptItself {


  public void ProductOfArrayExceptItself() {


    int[] input = new int[]{110, 15, 67, 89};

    int[] array1 = new int[input.length];
    int[] array2 = new int[input.length];

    int temp = 1;
    for (int i = 0; i < input.length; i++) {

      array1[i] = temp;
      temp *= array1[i];

    }

    temp = 1;
    for (int i = input.length - 1; i >= 0; i--) {

      array2[i] = temp;
      temp *= array2[i];

    }

    for (int i = 0; i < input.length; i++) {

      input[i] = array1[i] * array2[i];


    }


  }

}
