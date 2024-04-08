package menuiteratorexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * DinerMenuIterator class implements the Iterator interface.
 * This class is used to iterate through the DinerMenu items.
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem>{

  /**
   * The array of menu items.
   */
  private List<MenuItem> items = new ArrayList<>();
  private int position = 0;

  /**
   * Constructor.
   * @param items The list of menu items.
   */
  // constructor
  public PancakeHouseMenuIterator(List<MenuItem> items) {
    this.items = items;
    position = 0;
  }

  @Override
  public boolean hasNext() {
    if (items.isEmpty()) {
      return false;
    }
    return position < items.size();
  }

  @Override
  public MenuItem next() {
    return items.get(position++);
  }

  @Override
  public void remove() {
    System.out.println("Remove is not supported");
  }


}
