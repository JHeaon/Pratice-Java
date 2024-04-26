import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 0;

        try {
            if (number2 == 0) {
                Exception e = new Exception("고의로 발생시킴");
                throw e;
            }
        } catch (Exception e){
            System.out.println("에러메세지 : " + e.getMessage());
            e.printStackTrace();
        }



    }
}
