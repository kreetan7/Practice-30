public class DiscountCalculator {
    public static void main(String[] args) {
        String productName = "School Bag";
        double originalPrice = 80.0;
        double discountPercent = 15.0;

        double discountAmount = calculateDiscount(originalPrice, discountPercent);
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Discount Calculator");
        System.out.println("-------------------------");
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Percent: " + discountPercent + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);
    }

    public static double calculateDiscount(double price, double percent) {
        return (price * percent) / 100;
    }
}
