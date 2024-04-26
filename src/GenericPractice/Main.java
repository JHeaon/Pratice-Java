package GenericPractice;


// 1. 제네릭은 클래스 또는 메서드에 사용 가능하다.
// <>안에 들어가야 할 타입을 명시한다.

public class Main<T> {

    // 2. 내부 필드에 String
    private T t;

    // 3. 메서드의 return 타입도 String
    public T get(){
        return this.t;
    }





    public static void main(String[] args)
    {}
}
