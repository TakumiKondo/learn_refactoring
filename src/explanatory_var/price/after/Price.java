package explanatory_var.price.after;

public class Price {
    private int _quatity;
    private int _itemPrice;

    Price(int quantity, int itemPrice){
        _quatity = quantity;
        _itemPrice = itemPrice;
    }

    double price() {
        final double basePrice = _quatity * _itemPrice;	// 基本価格
        final double quantityDiscount = Math.max(0, _quatity - 500) * _itemPrice * 0.05;	// 数量割引
        final double sipping = Math.min(_quatity * _itemPrice * 0.1, 100.0);	// 送料
        return basePrice -	quantityDiscount +sipping;
    }
}
