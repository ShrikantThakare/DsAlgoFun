package SortSearch;

/**
 * Created by shthakar on 3/26/17.
 */
public class Element implements Comparable<Element> {
  Integer value;
  int listIndex;

  public Element(int i, Integer value) {
    value=value;
    listIndex =i;
  }

  public Integer getValue() {
    return value;
  }

  public int getListIndex() {
    return listIndex;
  }


  @Override
  public int compareTo(Element o) {
    return value - o.getValue();
  }
}
