package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLevel2 {
    public static void main(String[] args) {
        boolean exit = true;
        Scanner sc = new Scanner(System.in);

        // Level2 요구사항 2 : Level 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정합니다.
        // Level2 요구사항 6 : Calculator 인스턴스를 생성(new)할 때 생성자를 통해 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 되도록 수정합니다.
        List<Long> resultList = new ArrayList<>();
        List<Double> circleResultList = new ArrayList<>();
        Calculator calculator = new Calculator(resultList, circleResultList);

        // Level2 요구사항8 : 사칙연산을 수행하는 계산기 ArithmeticCalculator 클래스와 원과 관련된 연산을 수행하는 계산기 CircleCalculator 클래스 2개를 구현합니다.
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(resultList);
        CircleCalculator circleCalculator = new CircleCalculator(circleResultList);

        // Level2 요구사항 7 : Calculator 클래스에 반지름을 매개변수로 전달받아 원의 넓이를 계산하여 반환해주는 메서드를 구현합니다.
        System.out.print("연산을 선택해주세요 (1)사칙연산 (2)원의 넓이 (숫자를 입력해주세요): ");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            while (exit) {
                String command = "";

                System.out.print("첫 번째 숫자를 입력하세요: ");
                long firstNumber = Long.parseLong(sc.nextLine());
                System.out.print("두 번째 숫자를 입력하세요: ");
                long secondNumber = Long.parseLong(sc.nextLine());
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operation = sc.nextLine().charAt(0);

                long result = calculator.calculate(firstNumber, secondNumber, operation);
                calculator.setResultList(result);

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                command = sc.nextLine();
                if(command.equals("inquiry")) {
                    calculator.inquiryResults();
                }

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하겠습니까? (remove 입력 시 삭제): ");
                command = sc.nextLine();
                if(command.equals("remove")) {
                    calculator.removeResult();
                }


                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
                command = sc.nextLine();
                exit = !command.equals("exit");

            }
        }
        else if (choice == 2) {
            while (exit) {
                String command = "";

                System.out.print("원의 반지름 길이를 입력하세요: ");
                long radius = Long.parseLong(sc.nextLine());
                double result = calculator.calculateCircleArea(radius);
                System.out.println("결과 : " + result);
                calculator.setCircleResultList(result);
                System.out.print("저장된 원의 넓이 리스트 : ");

                for(double circleResult : calculator.getCircleResultList()){
                    System.out.print(circleResult + " ");
                }

                System.out.println();
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
                command = sc.nextLine();
                exit = !command.equals("exit");

            }
        }

    }
}
