package testdcd.twst;
import java.util.Scanner;

class Main {
    private static final Scanner     sc  = new Scanner(System.in);
    private static final BankService svc = new BankService();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = readInt("선택: ");
            switch (choice) {
                case 1 -> doCreateAccount();
                case 2 -> doDeposit();
                case 3 -> doWithdraw();
                case 4 -> doSearch();
                case 5 -> svc.printAllAccounts();
                case 6 -> svc.printHistory();
                case 7 -> {
                    System.out.println("은행 시스템을 종료합니다.");
                    sc.close(); return;
                }
                default -> System.out.println("1~7 사이 번호를 입력하세요.");
            }
        }
    }

    // ── 메뉴 ───────────────────────────────────────────────
    private static void showMenu() {
        System.out.println("\n╔══════════════════════════╗");
        System.out.println("║      은행 계좌 관리 시스템    ║");
        System.out.println("╠══════════════════════════╣");
        System.out.println("║  1. 계좌 생성              ║");
        System.out.println("║  2. 입금                   ║");
        System.out.println("║  3. 출금                   ║");
        System.out.println("║  4. 계좌 조회              ║");
        System.out.println("║  5. 전체 계좌 목록          ║");
        System.out.println("║  6. 거래 내역              ║");
        System.out.println("║  7. 종료                   ║");
        System.out.println("╚══════════════════════════╝");
    }

    // ── 1. 계좌 생성 ───────────────────────────────────────
    private static void doCreateAccount() {
        System.out.print("예금주 이름: ");
        String name = sc.next();
        int    init = readInt("초기 입금액: ");
        svc.createAccount(name, init);
    }

    // ── 2. 입금 ────────────────────────────────────────────
    private static void doDeposit() {
        int no     = readInt("계좌번호: ");
        int amount = readInt("입금액: ");
        try {
            svc.deposit(no, amount);
        } catch (IllegalArgumentException e) {
            System.out.println("[오류] " + e.getMessage());
        }
    }

    // ── 3. 출금 (예외 처리 핵심 포인트) ────────────────────
    private static void doWithdraw() {
        int no     = readInt("계좌번호: ");
        int amount = readInt("출금액: ");
        try {
            svc.withdraw(no, amount);
        } catch (InsufficientBalanceExceptions e) {
            // 사용자 정의 예외 처리
            System.out.println("[잔액 부족] " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("[오류] " + e.getMessage());
        }
    }

    // ── 4. 계좌 조회 ───────────────────────────────────────
    private static void doSearch() {
        int no = readInt("조회할 계좌번호: ");
        try {
            System.out.println(svc.findByNo(no));
        } catch (IllegalArgumentException e) {
            System.out.println("[오류] " + e.getMessage());
        }
    }

    // ── 숫자 입력 헬퍼 ─────────────────────────────────────
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.next().trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            }
        }
    }
}
public class Mains {
}
