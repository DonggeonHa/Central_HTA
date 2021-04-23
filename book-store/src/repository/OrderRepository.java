package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import vo.Order;

public class OrderRepository {

	private List<Order> db = new ArrayList<>();
	
	public OrderRepository() {
		loadData();
	}
	
	/**
	 * 모든 주문정보를 반환한다.
	 * @return 주문정보
	 */
	public List<Order> getAllOrders() {
		return db;
	}
	
	
	/**
	 * 지정된 주문정보를 저장한다.
	 * @param order 주문정보
	 */
	public void insertOrder(Order order) {
		db.add(order);
	}
	
	private void loadData() {
		try (FileReader fileReader = new FileReader("src/order.csv");
				BufferedReader reader = new BufferedReader(fileReader);) {
			
			String text = null;
			while ((text = reader.readLine()) != null) {
				String[] values = text.split(",");
				
				String userId = values[0];
				int bookNo = Integer.parseInt(values[1]);
				int amount = Integer.parseInt(values[2]);
				
				Order order = new Order(userId, bookNo, amount);
				
				db.add(order);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try (PrintWriter writer = new PrintWriter("src/order.csv")) {
			for (Order order : db) {
				StringBuilder sb = new StringBuilder();
				
				sb.append(order.getUserId())
					.append(",")
					.append(order.getBookNo())
					.append(",")
					.append(order.getAmount());
					
					
				String text = sb.toString();
				
				writer.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
