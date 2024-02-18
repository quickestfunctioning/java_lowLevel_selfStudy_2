package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        ProductOrder product1 = createOrder("두부", 2000, 2);
        ProductOrder product2 = createOrder("김치", 5000, 1);
        ProductOrder product3 = createOrder("콜라", 1500, 2);

        orders[0] = product1;
        orders[1] = product2;
        orders[2] = product3;

        printOrders(orders);

        System.out.println(getTotalAmount(orders));

    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder a = new ProductOrder();
        a.productName = productName;
        a.price = price;
        a.quantity = quantity;
        return a;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println(order.productName+" "+order.price+"원 "+order.quantity+"개");
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int a = 0;
        for (ProductOrder order : orders) {
            a += (order.price) * (order.quantity);
        }

        return a;
    }
}
