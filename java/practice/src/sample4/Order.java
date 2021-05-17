package sample4;

public class Order {

	private Product item;	// 주문상품
	private int amount;		// 주문수량
	
	public Order() {}

	public Order(Product item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getOrderPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSavedPoint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
