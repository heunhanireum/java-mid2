package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);

        //컴파일오류
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        //Animal로 들어올지 Integer로 들어올 지 알 수 없음 -> 컴파일러는 Object라고 가정
        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();
    }

    public T bigger(T target) {
        //컴파일오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
