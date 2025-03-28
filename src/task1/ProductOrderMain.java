package task1;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부",2000,3);
        orders[1] = createOrder("김치",3000,10);
        orders[2] = createOrder("과자",1600,8);

        printOrder(orders);
        totalAmount(orders);
    }

    //task1.ProductOrder 인스턴스를 생성하고, 값을 할당하고, 인스턴스를 반환하는 메서드.
    //task1.ProductOrder 인스턴스를 반환하므로 반환 타입은 ProductOrder이다.
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    //주문목록을 출력하는 메서드
    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price
                    + ", 수량 : " + order.quantity);
        }
    }

    //총 결제 금액을 계산하고 출력하는 메서드
    static void totalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }


}
