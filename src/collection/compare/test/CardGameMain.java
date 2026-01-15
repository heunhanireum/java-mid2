package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameMain {

    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for (CardCh ch : CardCh.values()) {
                cards.add(new Card(i, ch));
            }
        }

        Collections.shuffle(cards);

        List<Card> player1 = cards.subList(0, 5);
        player1.sort(new CardComparator());

        List<Card> player2 = cards.subList(5, 10);
        player2.sort(new CardComparator());

        System.out.println("플레이어1의 카드: " + player1 + ", 합계: " + sum(player1));
        System.out.println("플레이어2의 카드: " + player2 + ", 합계: " + sum(player2));

        if (sum(player1) > sum(player2)) {
            System.out.println("플레이어1 승리");
        } else if (sum(player1) < sum(player2)) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static int sum(List<Card> cards) {
        int result = 0;
        for (Card card : cards) {
            result += card.getNumber();
        }
        return result;
    }
}
