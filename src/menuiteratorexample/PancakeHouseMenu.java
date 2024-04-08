package menuiteratorexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * PancakeHouseMenu class.
 */
public class PancakeHouseMenu {
 private List<MenuItem> menuItems;

  /**
    * Constructor.
    */
  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuItem>();
    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Panckes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);

  }

  /**
   * Add item to the menu.
   *
   * @param name The name of the item.
   * @param description The description of the item.
   * @param vegetarian True if the item is vegetarian.
   * @param price The price of the item.
   */
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  /**
   * Get the menu items.
   *
   * @return The menu items.
   */
  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  /**
   * Get the menu items iterator.
   *
   * @return The menu items iterator.
   */
  public PancakeHouseMenuIterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}
