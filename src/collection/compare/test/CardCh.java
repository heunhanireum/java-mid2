package collection.compare.test;

public enum CardCh {
    /*
        System.out.println("\u2660"); //스페이드
        System.out.println("\u2665"); //하트
        System.out.println("\u2666"); //다이아
        System.out.println("\u2663"); //클로버
*/
    SPADE("\u2660", 1),
    HEART("\u2665", 2),
    DIAMOND("\u2666", 3),
    CLOVER("\u2663", 4);


    private final String ch;
    private final int seq;

    CardCh(String ch, int seq) {
        this.ch = ch;
        this.seq = seq;
    }

    public String getCh() {
        return ch;
    }

    public int getSeq() {
        return seq;
    }
}
