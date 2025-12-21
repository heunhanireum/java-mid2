package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        inputWord(dictionary);
        searchWord(dictionary);
    }

    private static void inputWord(Map<String, String> dictionary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("단어 뜻을 입력하세요 (종료는 'q'): ");
            String word = sc.nextLine();
            if (word.equals("q")) {
                break;
            }
            dictionary.getOrDefault(word, null);
            System.out.print("한글 뜻을 입력하세요: ");
            dictionary.put(word, sc.nextLine());
        }
    }

    private static void searchWord(Map<String, String> dictionary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String word = sc.nextLine();
            if (word.equals("q")) {
                break;
            }
            if (!dictionary.containsKey(word)) {
                System.out.println(word + "은(는) 사전에 없는 단어입니다.");
            } else {
                System.out.println(word + "의 뜻: " + dictionary.get(word));
            }
        }
    }
}
