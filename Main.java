import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<GroceryItem> items = List.of(
                new GroceryItem("Apple", "Fruit", 1.2, true),
                new GroceryItem("Milk", "Dairy", 2.5, false),
                new GroceryItem("Broccoli", "Vegetable", 1.8, true),
                new GroceryItem("Cheese", "Dairy", 4.0, false),
                new GroceryItem("Banana", "Fruit", 0.9, false)
        );

        System.out.println("✅ All Grocery Items:");
        items.forEach(System.out::println);

        System.out.println("\n🟢 Organic Items:");
        items.stream()
                .filter(GroceryItem::isOrganic)
                .forEach(System.out::println);

        System.out.println("\n🍌 Fruits Under ₹2:");
        items.stream()
                .filter(i -> i.getCategory().equalsIgnoreCase("Fruit") && i.getPrice() < 2)
                .forEach(System.out::println);

        double dairyTotal = items.stream()
                .filter(i -> i.getCategory().equalsIgnoreCase("Dairy"))
                .mapToDouble(GroceryItem::getPrice)
                .sum();
        System.out.println("\n🧀 Total Cost of Dairy Items: ₹" + dairyTotal);

        System.out.println("\n📊 Items Sorted by Price:");
        items.stream()
                .sorted(Comparator.comparingDouble(GroceryItem::getPrice))
                .forEach(System.out::println);

        System.out.println("\n📦 Grouped by Category:");
        Map<String, List<GroceryItem>> grouped = items.stream()
                .collect(Collectors.groupingBy(GroceryItem::getCategory));
        grouped.forEach((category, list) -> {
            System.out.println(category + ":");
            list.forEach(item -> System.out.println("  - " + item));
        });
    }
}
