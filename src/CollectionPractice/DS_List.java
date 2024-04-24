package CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class DS_List {
    public static void main(String[] args) {
        // 배열 리스트, 메모리 한줄로 저장하여 진행
        // 리스트 선언과 초기화
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // 리스트에 값 넣는 법
        intList.add(1);

        // 리스트에 값을 찾는 방법
        System.out.println(intList.get(0));

        // 리스트에 있는 값을 바꾸는 방법
        intList.set(0, 2);
        System.out.println(intList.get(0));

        // 삭제
        intList.remove(0);

        // 전체삭제
        intList.clear();

        // 리스트를 문자열 바꾸는 방법
        System.out.println(intList.toString());



        // Linked list
        // 메모리에 남는 공간을 요청해서 실제 값을 담아놓는다.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조
        // 값을 여기저기 나누기에 조회하는 속도는 느리지만, 값을 추가하거나 삭제할때는 빠르다.

        // 링크드리스트 선언 및 초기화
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 값 넣기
        linkedList.add(1);
        linkedList.add(2);

        // 값 가져오기
        linkedList.get(0);

        // 값 삭제
        linkedList.remove(0);

        // 값 수정
        linkedList.set(0, 2);

        // 값 모두 삭제
        linkedList.clear();

        // 값 조회
        System.out.println(linkedList.toString());



    }
}
