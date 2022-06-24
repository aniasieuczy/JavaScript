import java.util.HashMap;
import java.util.Map;

public class Warehouse {

        private String product;
        private int price;
        private int stock;

        public Warehouse () {

        }

        public void addProduct(String product, int price, int stock) {
            this.product = product;
            this.price = price;
            this.stock = stock;
        }


        public int price(String product) {
            Map<String, Integer> warehousePrices = new HashMap<>();
            warehousePrices.put(product, price);

            return warehousePrices.getOrDefault(product, -99);
        }



}
