package menuiteratorexample;



/**
 * Main class to demonstrate the Iterator pattern.
 */
public class Main {

  /**
   * Main entry point of the program.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    DinerMenu menu = new DinerMenu();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

    System.out.println("Diner Menu:");
    DinerMenuIterator dinerIterator = menu.createIterator();
    while (dinerIterator.hasNext()) {
      MenuItem item = dinerIterator.next();
      System.out.println(item.toString());
    }

    System.out.println("Pancake House Menu:");
    PancakeHouseMenuIterator pancakeIterator = pancakeHouseMenu.createIterator();
    while (pancakeIterator.hasNext()) {
      MenuItem item = pancakeIterator.next();
      System.out.println(item.toString());
    }




  }
}
