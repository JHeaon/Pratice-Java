package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    // Level2 요구사항 1 : 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
    // final을 사용한 이유는 한번 참조된 resultList, circleResultList가 다른 객체로 참조되는 것을 방지하기 위해서이다.
    // static을 사용하지 않은 이유는 해방 부분을 클래스 변수로 두게 되면, 각 계산기에 두게 되는 결과리스트들이 같아지기 때문에 static으로 선언하지 않았다.
    private final List<Long> resultList;
    private final List<Double> circleResultList;

    Calculator(List<Long> resultList, List<Double> circleResultList) {
        this.resultList = resultList;
        this.circleResultList = circleResultList;
    }


    public long calculate(long firstNumber, long secondNumber, char operation) {
        long result = 0;


        switch (operation){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/':
                try{
                    result = firstNumber / secondNumber;
                } catch (ArithmeticException e){
                    throw e;
                }
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산 기호입니다.");
        }

        return result;
    }

    // Level2 요구사항 3 : App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정합니다. (캡슐화)
    public List<Long> getResultList() {
        return this.resultList;
    }

    public void setResultList(long result) {
        resultList.add(result);
    }


    // Level2 요구사항 4 : Calculator 클래스에 저장된 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정합니다.
    public void removeResult(){
        resultList.removeFirst();
    }

    // Level2 요구사항 5 : Calculator 클래스에 저장된 연산 결과들을 조회하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 조회 메서드가 활용될 수 있도록 수정합니다.
    public void inquiryResults(){
        System.out.println("연산결과를 저장한 리스트 : " + Arrays.toString(resultList.toArray()));
    }

    public List<Double> getCircleResultList() {
        return circleResultList;
    }

    public void setCircleResultList(double result) {
        circleResultList.add(result);
    }

    public double calculateCircleArea(long radius){
        return radius * radius * Math.PI;
    }


}
