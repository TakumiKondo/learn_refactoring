package explanatory_var.price.after2;

public class Price {
    private int _quatity;
    private int _itemPrice;

    Price(int quantity, int itemPrice){
        _quatity = quantity;
        _itemPrice = itemPrice;
    }

    double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    // 基本価格
    private double basePrice() {
        return _quatity * _itemPrice;
    }

    // 数量割引
    private double quantityDiscount() {
        return Math.max(0, _quatity - 500) * _itemPrice * 0.05;
    }

    // 送料
    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }
}
