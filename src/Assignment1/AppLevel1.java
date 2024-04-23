package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppLevel1 {

    final static int RESULT_ARRAY_SIZE = 10;

    private static String errorMessage = "";

    // Level1 요구사항 5 : 연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 연산의 결과를 저장합니다.
    private static long[] resultArray = new long[RESULT_ARRAY_SIZE];
    private static int resultArrayIndex;

    // Level1 요구사항 7 : 연산 결과가 10개로 고정되지 않고 무한이 저장될 수 있도록 소스 코드를 수정합니다.
    private static List<Long> resultList = new ArrayList<Long>();
    private static Scanner sc = new Scanner(System.in);

    private static boolean exit = true;


    // 계산하는 함수
    public static long calculate(long firstNumber, long secondNumber, char operation){
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
                    errorMessage = e.getMessage();
                    System.out.println("오류가 발생하였습니다 : " + errorMessage);
                }
                break;
        }

        return result;
    }

    // 계산결과값을 저장하는 함수
    public static void storeResult(long result){

        if (errorMessage.isEmpty()){
            System.out.println("결과: " + result);

            // Level1 요구사항6 : 연산 결과가 10개를 초과하는 경우 가장 먼저 저장된 결과를 삭제하고 새로운 연산 결과가 저장될 수 있도록 소스 코드를 수정합니다.
            if (resultArrayIndex == 10){
                for(int i = 0; i < resultArray.length - 1; i++){
                    resultArray[i] = resultArray[i + 1];
                }
                resultArray[resultArrayIndex - 1] = result;
            }
            else{
                resultArray[resultArrayIndex] = result;
                resultList.add(result);
                resultArrayIndex++;
            }
        }

    }

    // 배열과 리스트에 들은 값을 출력하는 함수
    public static void printArrayList(){
        String command;
        System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
        command = sc.nextLine();
        // Level1 요구사항8 : “inquiry”라는 문자열이 입력되면 저장된 연산 결과 전부를 출력합니다. foreach문으로 구현했으나, 보기 불편하여 Arrays.toString으로 코드 작성
        if(command.equals("inquiry")){
            // for(long element : resultArray){
            //    System.out.print(element + " ");
            // }
            // for(long element : resultList){
            //     System.out.print(element + " ");
            // }
            // System.out.println();

            System.out.println("연산결과를 10개로 저장한 배열 : " + Arrays.toString(resultArray));
            System.out.println("연산결과를 무한으로 저장한 리스트 : " + Arrays.toString(resultList.toArray()));
        }

    }

    // 각 배열과 리스트의 첫 요소를 제거하는 함수
    public static void removeFirstResult(){
        String command;
        System.out.print("가장 먼저 저장된 연산 결과를 삭제하겠습니까? (remove 입력 시 삭제): ");

        command = sc.nextLine();
        if (command.equals("remove")){

            // 배열 제거
            for(int i = 0; i < resultArrayIndex; i++){
                resultArray[i] = resultArray[i + 1];
            }
            for(int i = resultArrayIndex; i < resultArray.length - 1; i++){
                resultArray[i] = 0;
            }
            resultArrayIndex--;

            // 리스트 제거
            resultList.removeFirst();

        }
    }


    public static void main(String[] args) {

        // Level1 요구사항1 : Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
        // Level1 요구사항2 : Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        long firstNumber;
        long secondNumber;
        char operation;
        long result;
        String command;


        while (exit) {
            errorMessage = "";

            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstNumber = Long.parseLong(sc.nextLine());
            System.out.print("두 번째 숫자를 입력하세요: ");
            secondNumber = Long.parseLong(sc.nextLine());
            System.out.print("사칙연산 기호를 입력하세요: ");
            operation = sc.nextLine().charAt(0);

            // Level1 요구사항3 : 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력합니다.
            result = calculate(firstNumber, secondNumber, operation);
            storeResult(result);
            printArrayList();
            removeFirstResult();


            // Level1 요구사항 4 : 반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정합니다.
            System.out.print("더 계산하기겠습니까? (exit 입력 시 종료) : ");
            command = sc.nextLine();
            exit = !command.equals("exit");
        }

    }
}

