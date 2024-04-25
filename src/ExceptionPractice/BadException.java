package ExceptionPractice;

public class BadException extends  Exception{
    public BadException (){
        super("위험한 행동을 할때에는 예외처리가 필수이다.");
    }
}
