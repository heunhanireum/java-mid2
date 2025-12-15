package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        LinkedHashSet<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        /*
        List<Integer> list1 = Arrays.asList(1, 2, 3); //...문법: 들어오는 값들을 합쳐서 배열로 바꿔서 넘겨준다.
        List<Integer> list2 = List.of(1, 2, 3); //권장
        */
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
