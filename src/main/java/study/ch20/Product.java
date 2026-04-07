package study.ch20;

import lombok.Builder;
import lombok.Data;

@Builder
public class Product {
    private String productName;
    private int price;

}
