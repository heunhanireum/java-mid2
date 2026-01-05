package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바 5
        List<Integer> list4 = List.of(); //자바 9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3); //arr의 참조값을 그대로 가져옴 -> set으로 arrList의 값을 바꾸면 arr의 값도 바뀐다
        List<Integer> list6 = List.of(1, 2, 3); //새로 구성해서 새로운 List를 만듦, 웬만하면 List.of를 사용하는 것을 권장

/*
        Integer[] arr = {1, 2, 3, 4, 5 ... 123232}
        //엄청 큰 배열이 만들어지면 asList로 생성할 경우 그대로 가져오기 때문에 생성하는 비용이 적게 듦
        List<Integer> arrList = Arrays.asList(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
*/

    }
}
