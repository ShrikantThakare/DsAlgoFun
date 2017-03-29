package ArrayandString;

/**
 * Created by shthakar on 3/28/17.
 */
public class AllSubSetofGivenSet {


  public static void printSubSets(char[] set){

    int length = set.length;

    for (int i=0;i<(1<<length);i++){

      System.out.println("{");
      for(int j=0;j<length;j++){
        if( (i & (1<<j))>0){
          System.out.println(set[j]+" ");
        }
      }
      System.out.println("}");
    }
  }
}
