package collection.compare.test.testAnswer;

public class Card implements Comparable<Card> {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anothorCard) {
        //숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.rank != anothorCard.rank) {
            return Integer.compare(this.rank, anothorCard.rank);
        } else {
            return this.suit.compareTo(anothorCard.suit); //enum은 ordinal 순서로 compareTo가 구현되어 있음. final로 구현되어있어서 재구현 불가
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
