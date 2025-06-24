public class GroceryItem {
    private String name;
    private String category;
    private double price;
    private boolean isOrganic;

    public GroceryItem(String name, String category, double price, boolean isOrganic) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.isOrganic = isOrganic;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isOrganic() { return isOrganic; }
    public void setOrganic(boolean isOrganic) { this.isOrganic = isOrganic; }

    @Override
    public String toString() {
        return name + " (" + category + ") - ₹" + price + " | Organic: " + isOrganic;
    }
}
