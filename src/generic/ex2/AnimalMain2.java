package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0); //추상 클래스로 안만들어서 객체 생성 가능
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>(); //부모 타입 매개변수로 생성하고 자식을 담을 수 있음
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        //꺼낼때는 부모 타입으로 나오므로 자식 타입으로 고정해야 한다면 다운캐스팅 필요
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
