package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
        //return param instanceof T; //컴파일 오류 -> T가 런타임에서 Object로 바뀌어버림 -> 타입 매개변수의 instanceof를 허용하지 X
        return false;
    }

    public void create() {
        //return new T(); //컴파일 오류 -> T가 런타임에서 Object로 바뀌어버림 -> 타입 매개변수의 new를 허용하지 X
    }
}
