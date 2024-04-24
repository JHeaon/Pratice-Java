package CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class DS_Set {
    public static void main(String[] args) {
        // Set (집합)
        // 순서 없고 중복 없음
        // Set -> HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set은 생성자가 없는 껍데기라 바로 생성 할 수 없음

        // 선언 및 초기화
        Set<Integer> set = new HashSet<Integer>();

        // 값 추가
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);

        // 값 출력
        for(Integer i : set){
            System.out.println(i);
        }

        // 해당 요소가 집합에 포함 요소인지 확인하기
        System.out.println(set.contains(1));
        System.out.println(set.contains(5));


    }
}
