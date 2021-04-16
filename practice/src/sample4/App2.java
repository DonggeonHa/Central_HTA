package sample4;

import java.text.DecimalFormat;
import java.util.Scanner;

// 강사님 버전
public class App2 {

   private static Product findProduct(Product[] products, int productNo) {
      Product foundProduct = null;
      for (Product product : products) {
         if (product.getNo() == productNo) {
            foundProduct = product;
         }

      }
      return foundProduct;
   }

   private static DecimalFormat numberFormat = new DecimalFormat("#,###");

   public static String numberToCurrency(int number) {
      return numberFormat.format(number);
   }

   public static void main(String[] args) {
      // 상품정보를 조회할 수 있다.
      // 상품을 구매할 수 있다.
      // 상품구매내역을 출력할 수 있다.
      // 총 구매금액, 총 적립포인트를 출력할 수 있다.

      // 상품정보가 저장된 배열
      Product[] products = new Product[10];
      products[0] = new Product(10, "맥북프로", 2600000, 1000);
      products[1] = new Product(20, "애플워치", 600000, 1000);
      products[2] = new Product(30, "갤럭시워치", 450000, 1000);
      products[3] = new Product(40, "아이패드", 800000, 1000);
      products[4] = new Product(50, "TV", 260000, 1000);
      products[5] = new Product(60, "스피커", 260000, 1000);
      products[6] = new Product(70, "키보드", 260000, 1000);
      products[7] = new Product(80, "시계", 260000, 1000);
      products[8] = new Product(90, "맥북프로", 260000, 1000);
      products[9] = new Product(100, "맥북프로", 260000, 1000);

      
      // 구매정보가 저장된 배열
      Order[] orders = new Order[100];
      int position = 0;

      Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.println("---------------------------------------------------------");
         System.out.println("1.상품조회  2.구매  3.구매내역조회  4.총계조회   0.종료");
         System.out.println("----------------------------------------------------------");

         System.out.println("메뉴를 선택하세요");
         int menuNo = sc.nextInt();

         if (menuNo == 1) {
            System.out.println("[전체상품조회]");
            for (Product item : products) {
               if (item == null) {
                  break;
               }
               System.out.println(
                     item.getNo() + "\t" + item.getName() + "\t" + item.getPrice() + "\t" + item.getPoint());
            }
         } else if (menuNo == 2) {
            System.out.println("[상품구매]");
            System.out.println("구매할 상품번호 입력: ");
            int productNo = sc.nextInt();
            System.out.println("구매할 상품수량 입력: ");
            int amount = sc.nextInt();

            Product product = App2.findProduct(products, productNo);
            if (product == null) {
               System.out.println("[안내] 상품번호에 해당하는 상품이 없습니다.");
            } else {
               // 주문정보 생성
               Order order = new Order();
               order.setItem(product);
               order.setAmount(amount);

               // 주문배열에 저장하기
               orders[position++] = order;
               System.out.println("[안내] 주문이 완료되었습니다.");
            }
         } else if (menuNo == 3) {
            System.out.println("[구매 내역 조회]");
            if (position == 0) {
               System.out.println("[안내] 주문내역이 존재하지 않습니다.");
            } else {
               for (Order order : orders) {
                  if (order == null) {
                     break;
                  }
                  System.out.println("주문상품명: " + order.getItem().getName());
                  System.out.println("주문상품가격: " + numberToCurrency(order.getItem().getPrice()));
                  System.out.println("주문수량: " + order.getAmount() + "개");
               }
            }
         } else if (menuNo == 4) {
            System.out.println("[구매내역 총계 조회]");
            int totalOrderPrice = 0;
            int totalOrderCount = 0;
            int totalSavedPoint = 0;

            if (position > 0) {
               for (Order order : orders) {
                  if (order == null) {
                     break;
                  }
                  totalOrderPrice += order.getOrderPrice();
                  totalSavedPoint += order.getSavedPoint();
                  totalOrderCount++;
               }
            }
            System.out.println("총 구매금액: " + numberToCurrency(totalOrderPrice) + "원");
            System.out.println("총 구매금액: " + numberToCurrency(totalSavedPoint) + "점");
            System.out.println("총 구매금액: " + numberToCurrency(totalOrderCount) +"건");

         } else if (menuNo == 0) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
      }
   }
}