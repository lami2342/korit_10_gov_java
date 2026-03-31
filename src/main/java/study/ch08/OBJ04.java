package study.ch08;

public class OBJ04 {
    public static void main(String[] args) {
        class Addition{
            void add(int a) {}
            void add(double a) {}
            void add(int a, double b) {}
            void add(double a, int b) {}
            int add(int a,int b,int c){return a + b + c;}
            //오버로딩은 매개 변수의 갯수가 동일하면 동일한 함수로 판단함
            //매개 변수의 개수나 순서,타입이 다르면 다른 변수로 작용
            //리턴 값이나 그런건 필요 없음
        }

        Addition aaa = new Addition();
        aaa.add(10);
        aaa.add(10.5);
        aaa.add(10,10.5);
    }
}
