package menuiteratorexample;

import java.util.Iterator;

/**
 * DinerMenuIterator class implements the Iterator interface.
 * This class is used to iterate through the DinerMenu items.
 */
public class DinerMenuIterator implements Iterator<MenuItem>{

  /**
   * The array of menu items.
   */
  private MenuItem[] items;
  private int maxSize = 6;
  private int position = 0;
  // constructor
  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
    maxSize = items.length;
    position = 0;
  }

  @Override
  public boolean hasNext() {
    if (position >= maxSize || items[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public MenuItem next() {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

  @Override
  public void remove() {
    System.out.println("Remove is not supported");
  }


}
