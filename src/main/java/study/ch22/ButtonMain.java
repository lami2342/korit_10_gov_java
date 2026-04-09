package study.ch22;

class HomeButton implements ButtonClick{
    @Override
    public void onclick() {
        System.out.println("홈으로 이동");
    }
}
class BackButton implements ButtonClick{
    @Override
    public void onclick() {
        System.out.println("뒤로 이동");

    }
}
class LoginButton implements ButtonClick {
    @Override
    public void onclick() {
        System.out.println("로그인 요청");

    }
}

public class ButtonMain {
    static void main() {
        HomeButton homeButton = new HomeButton();
    }
}
