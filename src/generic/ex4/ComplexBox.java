package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //generic타입 T와 다르게 generid메서드를 Z로 설정하면 generic메서드는 Z따라감
    //클래스와 동일하게 T로 설정해도 generic메서드의 값을 따라감(클래스 T와 메서드 T는 무관)
    //우선순위: generic메서드>generic타입
    //generic메서드의 타입 매개변수는 상한이 없음 -> Object로 취급
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("z.className: " + z.getClass().getName());
        return z;
    }
}
