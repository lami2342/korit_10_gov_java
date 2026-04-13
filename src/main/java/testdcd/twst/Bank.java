package testdcd.twst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BankService {
    // Map: 계좌번호(key) → Account(value) — O(1) 조회
    private Map<Integer, Account> accounts = new HashMap<>();
    private List<Transaction>     history  = new ArrayList<>();

    // ── 계좌 생성 ──────────────────────────────────────────
    public Account createAccount(String owner, int initialBalance) {
        Account acc = new Account(owner, initialBalance);
        accounts.put(acc.getAccountNo(), acc);
        System.out.printf("계좌 개설 완료 → 계좌번호: %d%n", acc.getAccountNo());
        return acc;
    }

    // ── 계좌 조회 ──────────────────────────────────────────
    public Account findByNo(int no) {
        Account acc = accounts.get(no);
        if (acc == null) throw new IllegalArgumentException("존재하지 않는 계좌번호: " + no);
        return acc;
    }

    // ── 입금 ───────────────────────────────────────────────
    public void deposit(int accountNo, int amount) {
        Account acc = findByNo(accountNo);
        acc.deposit(amount);
        history.add(new Transaction("입금", accountNo, amount, acc.getBalance()));
        System.out.printf("입금 완료 | 잔액: %,d원%n", acc.getBalance());
    }

    // ── 출금 (InsufficientBalanceException 전파) ───────────
    public void withdraw(int accountNo, int amount) throws InsufficientBalanceExceptions {
        Account acc = findByNo(accountNo);
        acc.withdraw(amount);   // 예외 발생 시 여기서 throw됨
        history.add(new Transaction("출금", accountNo, amount, acc.getBalance()));
        System.out.printf("출금 완료 | 잔액: %,d원%n", acc.getBalance());
    }

    // ── 전체 계좌 목록 ─────────────────────────────────────
    public void printAllAccounts() {
        if (accounts.isEmpty()) { System.out.println("개설된 계좌가 없습니다."); return; }
        System.out.println("=".repeat(65));
        accounts.values().forEach(System.out::println);
        System.out.println("=".repeat(65));
    }

    // ── 거래 내역 ──────────────────────────────────────────
    public List<Transaction> getHistory() { return history; }

    public void printHistory() {
        if (history.isEmpty()) { System.out.println("거래 내역이 없습니다."); return; }
        System.out.println("=".repeat(75));
        history.forEach(System.out::println);
        System.out.println("=".repeat(75));
    }
}
public class Bank {
}
