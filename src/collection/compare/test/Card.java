package collection.compare.test;

public class Card implements Comparable<Card>{
    int number;
    CardCh ch;

    public Card(int number, CardCh ch) {
        this.number = number;
        this.ch = ch;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number +
                "(" + ch.getCh() +
                ')';
    }

    @Override
    public int compareTo(Card o) {
        return this.number < o.number || (this.number == o.number && this.ch.getSeq() < o.ch.getSeq()) ? -1 : (this.number > o.number || (this.number == o.number && this.ch.getSeq() > o.ch.getSeq()) ? 1 : 0);
    }
}
