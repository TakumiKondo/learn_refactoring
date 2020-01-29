package explanatory_var.price.before;

public class Price {
    private int _quatity;
    private int _itemPrice;

    Price(int quantity, int itemPrice){
        _quatity = quantity;
        _itemPrice = itemPrice;
    }

    double price() {
        return _quatity * _itemPrice -								// 基本価格
                Math.max(0, _quatity - 500) * _itemPrice * 0.05 +	// 数量割引
                Math.min(_quatity * _itemPrice * 0.1, 100.0);		// 送料
    }
}
