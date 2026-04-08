package study.ch20;

import java.util.ArrayList;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        List<OrderDetail> orderDetailList = new ArrayList<>();

        Product product1 = Product.builder().productName("마우스").price(20000).build();
        Product product2 = Product.builder().productName("키보드").price(30000).build();
        orderDetailList.addAll(
                List.of(
                        OrderDetail.builder().number(1).product(product1).stock(2).build(),
                        OrderDetail.builder().number(2).product(product2).stock(1).build()
                )
        );


    }
}
