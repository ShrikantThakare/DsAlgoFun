package General;

/**
 * Created by shthakar on 3/28/17.
 */
public class Fibo {

  int[] list = new int[10];

  public int fibo(int n) {

    if (n <= 1)
      return n;


    if (fibo(n) != -1)
      return list[n];
    else
      list[n] = fibo(n - 1) + fibo(n - 2);

    return list[n];

  }
}
