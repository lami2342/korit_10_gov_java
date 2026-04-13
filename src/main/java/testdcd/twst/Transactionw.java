package testdcd.twst;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Transaction {
    private static final DateTimeFormatter FMT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final String type;         // "입금" 또는 "출금"
    private final int    accountNo;
    private final int    amount;
    private final int    balanceAfter;
    private final String dateTime;

    public Transaction(String type, int accountNo, int amount, int balanceAfter) {
        this.type         = type;
        this.accountNo    = accountNo;
        this.amount       = amount;
        this.balanceAfter = balanceAfter;
        this.dateTime     = LocalDateTime.now().format(FMT);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | 계좌: %d | 금액: %,8d원 | 거래 후 잔액: %,10d원",
                dateTime, type, accountNo, amount, balanceAfter);
    }
}
public class Transactionw {

}
