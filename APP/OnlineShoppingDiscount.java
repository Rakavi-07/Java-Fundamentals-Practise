// Parent class
class Customer {
    double getDiscount() {
        return 0.0; // default: no discount
    }
}

// Child class RegularCustomer
class RegularCustomer extends Customer {
    @Override
    double getDiscount() {
        return 5.0; // 5% discount
    }
}

// Child class PremiumCustomer
class PremiumCustomer extends Customer {
    @Override
    double getDiscount() {
        return 10.0; // 10% discount
    }
}

// Main class
public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Customer c1 = new RegularCustomer();
        Customer c2 = new PremiumCustomer();

        System.out.println("Regular Customer Discount: " + c1.getDiscount() + "%");
        System.out.println("Premium Customer Discount: " + c2.getDiscount() + "%");
    }
}
