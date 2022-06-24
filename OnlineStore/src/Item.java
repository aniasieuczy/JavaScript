public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item () {
    }

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int price() {
        int price = getQty() * getUnitPrice();
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void increaseQuantity () {
        int qty = getQty() + 1;
        setQty(qty);
    }

    @Override
    public String toString() {
        return this.product + ": " + getQty() ;
    }

}

