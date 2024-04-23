package Assignment1;

public class AddOperator implements Operator{

    @Override
    public long operate(long firstNumber, long secondNumber){
        return firstNumber + secondNumber;
    }
}
