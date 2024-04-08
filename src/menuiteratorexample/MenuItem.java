package menuiteratorexample;

/**
 * A class representing a menu item.
 */
public class MenuItem {
  private final String name;
  private final String description;
  private final double price;
  private final boolean vegetarian;

  /**
   * Constructor.
   * @param name The name of the menu item.
   * @param description The description of the menu item.
   * @param price The price of the menu item.
   * @param vegetarian  Whether the menu item is vegetarian.
   */
  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vegetarian = vegetarian;
  }

  @Override
  public String toString() {
    String vegetarianFriendly = vegetarian ? " (v)" : "";
    return name + vegetarianFriendly + ", $" + price + "\n   " + description;
  }
}
