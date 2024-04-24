package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class DS_Map {
    public static void main(String[] args) {
        // Map 파이썬의 dict와 같음
        // key, value 가 중요
        // Map -> HashMap, TreeMap으로 응용 가능

        Map<String, Integer> map = new HashMap<>();

        // 키 값
        map.put("일", 2);
        map.put("이", 2);
        map.put("삼", 3);
        map.put("사", 4);


        // 배열 돌기
        // 맵의 모든 키를 가져오려면 map.keySet()
        // 맵의 모든 값을 가져오려면 map.values()
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
