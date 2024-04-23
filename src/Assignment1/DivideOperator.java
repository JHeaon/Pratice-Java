package Assignment1;

public class DivideOperator implements Operator{

    @Override
    public long operate(long firstNumber, long SecondNumber) {
        if(SecondNumber == 0){
            throw new ArithmeticException("나누는 수는 0이 되어선 안됩니다.");
        }
        return firstNumber / SecondNumber;
    }
}
