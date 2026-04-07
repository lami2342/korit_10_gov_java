package study.ch20;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderDetail {
    private int number;
    private Product product;
    private int stock;
}
