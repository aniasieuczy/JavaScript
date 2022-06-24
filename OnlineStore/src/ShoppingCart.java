import java.util.HashMap;
import java.util.Map;
import java.util.Set;


    public class ShoppingCart {

        private Item item;
        private Map<String, Item> shoppingCartItems;

        public ShoppingCart () {
            this.shoppingCartItems = new HashMap<>();
        }

        public void add(String product, int price) {
            if(shoppingCartItems.keySet().contains(product)) {
                item.increaseQuantity();
            }
            shoppingCartItems.put(product, new Item(product, 1, price));
        }

        public int price() {
            int totalPrice = 0;

            for(Item e: shoppingCartItems.values()) {
                totalPrice = totalPrice + e.getUnitPrice();
            }
            return totalPrice;
        }

        public void print() {

            Set<String> keys = shoppingCartItems.keySet();

            for(String elements: keys) {
                if(elements.equals(keys)) {
                    System.out.println(elements + ": " + shoppingCartItems.get(elements).getQty());
                }
            }
        }
    }

