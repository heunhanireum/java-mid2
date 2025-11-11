package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
         dogHospital.set(cat); //매개변수 체크 실패: 컴파일 오류가 발생하지 않음

        //문제2: 개 타입 반환
        dogHospital.set(dog);
        // Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200)); //bigger의 반환값이 Animal으로 됨
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); //Dog 타입으로 반환받으려면 다운캐스팅 필요
        System.out.println("biggerDog = " + biggerDog);

        //문제3: 실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외 발생
        dogHospital.set(dog);
        dogHospital.set(cat); //실수로 고양이 입력
        //고양이가 더 크므로 bigger의 반환타입이 Cat 될 것
        //하지만 Cat은 Dog로 캐스팅 불가
        // Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 300)); //ClassCastException 발생
        System.out.println("biggerDog = " + biggerDog);
    }
}
