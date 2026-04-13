package testdcd.twst;

class InsufficientBalanceExceptions extends RuntimeException {
    private int shortage; // 부족 금액

    public InsufficientBalanceExceptions(int balance, int amount) {
        super(String.format("잔액 부족! 현재 잔액: %,d원 | 요청 금액: %,d원 | 부족 금액: %,d원",
                balance, amount, amount - balance));
        this.shortage = amount - balance;
    }

    public int getShortage() { return shortage; }
}
public class InsufficientBalanceException {
}
