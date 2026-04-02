package study.ch12;

abstract class AA{

}

class BB extends AA {

}

class CC extends BB {

}

class MM {
    public static void main(String[] args) {

//        AA a = new AA(); //추상 클래스라서 생성 안됨
        BB b =new BB();
        AA b2 = new BB();
        AA c = new AA() { // new AA()는 이름없는 객체(업캐스팅 되어 상속 받는 중)

        };
        AA cc = new CC();
        AA ccc = new BB() {

        };

    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0]= new Dog();
        animals[1]= new Cat();
        animals[2]= new Animal() {
            @Override
            public void eat() {

            }
        };
    }
}
