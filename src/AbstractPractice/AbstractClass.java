package AbstractPractice;

public abstract class AbstractClass {
    int count;

    // 서로 공통적인 부분은 abstract 없이 그냥 작성한다.
    void test(){}

    // 상속으로 받을 때, 자식 클래스에서 해당 메서드를 고쳐야 한다면 abstract로 처리하는 것이 좋다.
    // 추상 클래스이 추상메서드는 반드시 오버라이딩 되어야 한다.
    abstract void print();

}
