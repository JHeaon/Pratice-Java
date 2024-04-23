package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class OperatorManager {
    private final Map<Character, Operator> operators;

    OperatorManager() {
        operators = new HashMap<>();
        operators.put('+', new AddOperator());
        operators.put('-', new SubtractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

    Operator getOperator(char operation) {
        Operator operator = operators.get(operation);
        if (operator == null) {
            throw new IllegalArgumentException("잘못된 연산 기호입니다.");
        }
        return operator;
    }
}
