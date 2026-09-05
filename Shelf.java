import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shelf {

   private ArrayList<Item> items;

   public Shelf() {
      items = new ArrayList<Item>();
   }

   public boolean addItem(Item item) {
      if (item == null || items.contains(item)) {
         return false;
      }

      items.add(item);
      return true;
   }

   public boolean removeItem(Item item) {
      return items.remove(item);
   }

   public List<Item> getItems() {
      return Collections.unmodifiableList(items);
   }
}
