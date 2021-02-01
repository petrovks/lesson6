package geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {
            Cat cat1 = new Cat("Barsik", "Black");
            Cat cat2 = new Cat("Tusik", "Orange");

        Dog dog1 = new Dog("Rex", "Black");
        Dog dog2 = new Dog("Sharik", "Grey");
            cat1.run(100);
            cat2.swim(10);

            dog1.run(456);
            dog2.run(700);

        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
