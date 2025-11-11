package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 명시적으로 쓰기를 권장
        integerBox.set(10); //위에처럼 안쓰면 Object로 됨 -> row type(원시 타입)
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

    }
}
