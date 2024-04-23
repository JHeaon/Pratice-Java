package Assignment1;
import java.util.List;

// Level2 요구사항 9 : ArithmeticCalculator 클래스의 연산 메서드에 책임(역할)이 많아 보입니다. 사칙연산 각각의 기능을 담당하는 AddOperator, SubtractOperator, MultiplyOperator, DivideOperator 클래스를 만들어 연산 메서드의 책임을 분리 해봅니다. (SRP)
// Level2 요구사항 10 :  ArithmeticCalculator 클래스에 추가로 나머지 연산(%) 기능을 추가하기 위해 ModOperator 클래스를 만들어 추가합니다.
public class ArithmeticCalculator extends Calculator{
    private final OperatorManager operatorManager;

    ArithmeticCalculator(List<Long> resultList) {
        super(resultList, null);
        this.operatorManager = new OperatorManager();

    }

    public long calculate(long firstNumber, long lastNumber, char operation) {
        Operator operator = operatorManager.getOperator(operation);
        long result = operator.operate(firstNumber, lastNumber);
        setResultList(result);
        return result;
    }
}
