package testdcd.twst;

class Account {
    // static으로 자동 채번 (1001부터 시작)
    private static int nextNo = 1001;

    private final int accountNo;
    private String owner;
    private int balance;

    public Account(String owner, int initialBalance) {
        this.accountNo = nextNo++;      // 채번 후 증가
        this.owner     = owner;
        this.balance   = initialBalance;
    }

    // ── 입금 ───────────────────────────────────────────────
    public void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");
        balance += amount;
    }

    // ── 출금 (잔액 부족 시 사용자 정의 예외) ────────────────
    public void withdraw(int amount) throws InsufficientBalanceExceptions {
        if (amount <= 0) throw new IllegalArgumentException("출금액은 0보다 커야 합니다.");
        if (balance < amount) throw new InsufficientBalanceExceptions(balance, amount);
        balance -= amount;
    }

    // ── Getter ─────────────────────────────────────────────
    public int    getAccountNo() { return accountNo; }
    public String getOwner()     { return owner; }
    public int    getBalance()   { return balance; }

    @Override
    public String toString() {
        return String.format("계좌번호: %d | 예금주: %-8s | 잔액: %,10d원", accountNo, owner, balance);
    }
}
public class Accounts {
}
