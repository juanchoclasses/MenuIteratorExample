package menuiteratorexample;

/**
 * This class represents a Diner Menu.
 */
public class DinerMenu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  /**
   * Constructor.
   */
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Vegetarian BLT",
        "(Fakin') Bacon with lettuce & tomato on whole wheat",
        true,
        2.99);
    addItem("BLT",
        "Bacon with lettuce & tomato on whole wheat",
        false,
        2.99);
    addItem("Soup of the day",
        "Soup of the day, with a side of potato salad",
        false,
        3.29);
    addItem("Hotdog",
        "A hot dog, with saurkraut, relish, onions, topped with cheese",
        false,
        3.05);
  }


  /**
   * Adds an item to the menu.
   *
   * @param name        The name of the item.
   * @param description The description of the item.
   * @param vegetarian  Whether the item is vegetarian.
   * @param price       The price of the item.
   */
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("Sorry, menu is full! Can't add item to menu");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public DinerMenuIterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
