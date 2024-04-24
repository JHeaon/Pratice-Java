package CollectionPractice;

import java.util.LinkedList;
import java.util.Queue;

public class DS_Queue {
    public static void main(String[] args) {
        // Queue
        // 큐 선언과 초기화
        Queue<Integer> queue = new LinkedList<Integer>();

        // 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // 값 빼기
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            System.out.println(queue.peek());
        }
    }
}
