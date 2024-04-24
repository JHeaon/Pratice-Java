package CollectionPractice;

import java.util.Stack;

public class DS_Stack {
    public static void main(String[] args) {

        // Stack
        Stack<Integer> stack = new Stack<Integer>();

        //값 넣기
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 스택에 값이 있는지 없는지 확인하기
        System.out.println(stack.isEmpty());

        // 스택에서 값 빼기
        int element = stack.pop();
        System.out.println(element);

        // 스택에 제일 높은 인덱스
        System.out.println(stack.peek());

        // 스택 사이즈
        System.out.println(stack.size());

    }
}
