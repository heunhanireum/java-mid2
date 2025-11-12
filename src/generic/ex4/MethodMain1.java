package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        //Integer result = (Integer) GenericMethod.objMethod(i); //Integer로 받으려면 캐스팅해줘야함

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        //generic메서드 앞에 <> 생략 가능
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i); //타입 추론 i -> Integer 타입이기 때문에 Integer가 들어올 것을 알 수 있음
        Integer integerValue2 = GenericMethod.numberMethod(10); //타입 추론
        Double doubleValue2 = GenericMethod.numberMethod(20.0); //타입 추론
    }
}
