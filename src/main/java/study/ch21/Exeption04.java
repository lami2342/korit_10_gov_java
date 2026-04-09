package study.ch21;

class InsufficientStockException extends Exception {
    private String productName;
    private int requested;
    private int available;

    public int getRequested() {
        return requested;
    }

    public int getAvailable() {
        return available;
    }

    public String getProductName() {
        return productName;
    }

    public InsufficientStockException(String product, int qty, int stock){
        super("(" + product + ") 재고 부족: 요청=(" + qty + "), 재고=(" + stock + ")");
        productName = product;
        requested = qty;
        available = stock;
    }

}

public class Exeption04 {
    public static void order(String product, int qty)throws InsufficientStockException{
        int stock = 10;
        if (qty > stock)
            throw new InsufficientStockException(product, qty, stock);
    }

    public static void main() {
        try{
            order("키보드",11);
        }catch (InsufficientStockException e){
            System.out.println(e.getAvailable());
            System.out.println(e.getProductName());
            System.out.println(e.getMessage());
            System.out.println(e.getRequested());
        }
    }
}

