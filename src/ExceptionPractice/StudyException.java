package ExceptionPractice;

import java.sql.SQLOutput;

public class StudyException {
    public static void main(String[] args) {
        Main m = new Main();

        try {
            m.thisMethodIsDangerous();
        } catch (BadException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // 무조건 여기는 실행
            System.out.println("예외 처리 완료");
        }
    }
}
